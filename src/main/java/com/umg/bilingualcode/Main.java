package com.umg.bilingualcode;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            // Path of the source code file to analyze
            String sourceFile = "input.spc";

            // Read input file
            CharStream input = CharStreams.fromFileName(sourceFile);

            // Create lexer
            SpanglishCodeLexer lexer = new SpanglishCodeLexer(input);

            // Generate tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create parser
            SpanglishCodeParser parser = new SpanglishCodeParser(tokens);

            // Optional: remove default console error messages
            parser.removeErrorListeners();

            // Add custom error listener
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                        Object offendingSymbol,
                                        int line,
                                        int charPositionInLine,
                                        String msg,
                                        RecognitionException e) {
                    System.err.println("Syntax error at line " + line +
                            ", column " + charPositionInLine + ": " + msg);
                }
            });

            // Start parsing from the 'program' rule
            parser.program();

            // If no syntax errors
            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Compilation successful: syntax is valid.");
            } else {
                System.out.println("Compilation finished with syntax errors.");
            }

        } catch (IOException e) {
            System.err.println("Error reading source file: " + e.getMessage());
        }
    }
}