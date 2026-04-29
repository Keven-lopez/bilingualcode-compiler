package com.umg.bilingualcode;


import org.antlr.v4.runtime.*;
import java.io.IOException;
import java.util.List;

import com.umg.bilingualcode.TableGenerators.*;


public class Main {

    public static void main(String[] args) {
        try {
            String sourceFile = "input.spc";

            CharStream input = CharStreams.fromFileName(sourceFile);

            SpanglishCodeLexer lexer = new SpanglishCodeLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();

            List<Token> tokenList = tokens.getTokens();

            SymbolTableGenerator symbolTableGenerator = new SymbolTableGenerator();
            symbolTableGenerator.generate(tokenList);

            LexicalErrorGenerator lexicalErrorGenerator = new LexicalErrorGenerator();
            lexicalErrorGenerator.generate(tokenList);

            RegexTableGenerator regexTableGenerator = new RegexTableGenerator();
            regexTableGenerator.generate();

            SpanglishCodeParser parser = new SpanglishCodeParser(tokens);
            parser.program();

            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Compilation successful.");
            } else {
                System.out.println("Compilation finished with syntax errors.");
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}