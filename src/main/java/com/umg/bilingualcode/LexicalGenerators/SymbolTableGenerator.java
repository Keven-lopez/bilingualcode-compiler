package com.umg.bilingualcode.LexicalGenerators;

import com.umg.bilingualcode.SpanglishCodeLexer;
import org.antlr.v4.runtime.Token;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SymbolTableGenerator {

    static class SymbolInfo {
        String lexeme;
        String category;
        String type;
        String value;
        int line;

        SymbolInfo(String lexeme, String category, String type, String value, int line) {
            this.lexeme = lexeme;
            this.category = category;
            this.type = type;
            this.value = value;
            this.line = line;
        }
    }

    public void generate(List<Token> tokens) throws IOException {
        Map<String, SymbolInfo> symbolTable = new LinkedHashMap<>();

        for (int i = 0; i < tokens.size(); i++) {
            Token token = tokens.get(i);

            // -------------------------------
            // VARIABLES
            // define edad como numero;
            // -------------------------------
            if (token.getType() == SpanglishCodeLexer.DEFINE) {

                Token identifier = tokens.get(i + 1);
                Token typeToken = tokens.get(i + 3);

                symbolTable.put(identifier.getText(),
                        new SymbolInfo(
                                identifier.getText(),
                                "Variable",
                                typeToken.getText(),
                                "null",
                                identifier.getLine()
                        )
                );
            }

            // -------------------------------
            // CONSTANTS
            // const PI como numero = 3.14;
            // -------------------------------
            if (token.getText().equals("const")) {

                Token identifier = tokens.get(i + 1);
                Token typeToken = tokens.get(i + 3);
                Token valueToken = tokens.get(i + 5);

                symbolTable.put(identifier.getText(),
                        new SymbolInfo(
                                identifier.getText(),
                                "Constant",
                                typeToken.getText(),
                                valueToken.getText(),
                                identifier.getLine()
                        )
                );
            }

            // -------------------------------
            // ASSIGNMENTS
            // poner edad a 20;
            // -------------------------------
            if (token.getType() == SpanglishCodeLexer.SET) {

                Token identifier = tokens.get(i + 1);
                Token valueToken = tokens.get(i + 3);

                if (symbolTable.containsKey(identifier.getText())) {
                    symbolTable.get(identifier.getText()).value = valueToken.getText();
                }
            }

            // -------------------------------
            // FUNCTIONS
            // function sumar(a,b) do
            // -------------------------------
            if (token.getType() == SpanglishCodeLexer.FUNCTION) {

                Token functionName = tokens.get(i + 1);

                symbolTable.put(functionName.getText(),
                        new SymbolInfo(
                                functionName.getText(),
                                "Function",
                                "-",
                                "-",
                                functionName.getLine()
                        )
                );

                // Parameters inside (...)
                int j = i + 3;
                while (tokens.get(j).getType() != SpanglishCodeLexer.RPAREN) {

                    Token param = tokens.get(j);

                    if (param.getType() == SpanglishCodeLexer.IDENTIFIER) {
                        symbolTable.put(param.getText(),
                                new SymbolInfo(
                                        param.getText(),
                                        "Parameter",
                                        "-",
                                        "-",
                                        param.getLine()
                                )
                        );
                    }

                    j++;
                }
            }
        }

        writeSymbolTable(symbolTable);
    }

    private void writeSymbolTable(Map<String, SymbolInfo> symbolTable) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output/symbol_table.txt"));

        writer.write(String.format("%-20s %-15s %-12s %-15s %-5s%n",
                "LEXEME", "CATEGORY", "TYPE", "VALUE", "LINE"));

        writer.write(String.format("%-20s %-15s %-12s %-15s %-5s%n",
                "--------------------", "---------------", "------------", "---------------", "-----"));

        for (SymbolInfo symbol : symbolTable.values()) {
            writer.write(String.format("%-20s %-15s %-12s %-15s %-5d%n",
                    symbol.lexeme,
                    symbol.category,
                    symbol.type,
                    symbol.value,
                    symbol.line));
        }

        writer.close();
    }
}