package com.umg.bilingualcode.TableGenerators;

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

            // Detect declarations:
            // define edad como numero;
            if (token.getType() == SpanglishCodeLexer.DEFINE) {

                Token identifier = tokens.get(i + 1);
                Token typeToken = tokens.get(i + 3);

                String varName = identifier.getText();
                String varType = typeToken.getText();

                symbolTable.put(varName,
                        new SymbolInfo(
                                varName,
                                "Variable",
                                varType,
                                "null",
                                identifier.getLine()
                        )
                );
            }

            // Detect assignments:
            // poner edad a 20;
            if (token.getType() == SpanglishCodeLexer.SET) {

                Token identifier = tokens.get(i + 1);
                Token valueToken = tokens.get(i + 3);

                String varName = identifier.getText();
                String value = valueToken.getText();

                if (symbolTable.containsKey(varName)) {
                    symbolTable.get(varName).value = value;
                }
            }
        }

        writeSymbolTable(symbolTable);
    }

    private void writeSymbolTable(Map<String, SymbolInfo> symbolTable) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output/symbol_table.txt"));

        writer.write("LEXEME\tCATEGORY\tTYPE\tVALUE\tLINE\n");

        for (SymbolInfo symbol : symbolTable.values()) {
            writer.write(
                    symbol.lexeme + "\t" +
                            symbol.category + "\t" +
                            symbol.type + "\t" +
                            symbol.value + "\t" +
                            symbol.line + "\n"
            );
        }

        writer.close();
    }
}