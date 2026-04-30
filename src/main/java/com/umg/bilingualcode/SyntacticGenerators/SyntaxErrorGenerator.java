package com.umg.bilingualcode.SyntacticGenerators;

import org.antlr.v4.runtime.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SyntaxErrorGenerator extends BaseErrorListener {

    private BufferedWriter writer;

    public SyntaxErrorGenerator() throws IOException {
        writer = new BufferedWriter(new FileWriter("output/syntaxOutput/syntax_errors.txt"));

        writer.write(String.format("%-20s %-25s %-10s %-10s%n",
                "LEXEME", "ERROR TYPE", "LINE", "COLUMN"));

        writer.write(String.format("%-20s %-25s %-10s %-10s%n",
                "--------------------", "-------------------------", "----------", "----------"));
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        String errorType = classifyError(msg);

        String lexeme = "";

        if (offendingSymbol instanceof Token token) {
            lexeme = token.getText();
        }

        try {
            writer.write(String.format("%-20s %-25s %-10d %-10d%n",
                    lexeme,
                    errorType,
                    line,
                    charPositionInLine));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private String classifyError(String msg) {

        if (msg.contains("missing ';'")) {
            return "Missing semicolon";
        }

        if (msg.contains("missing ')'")) {
            return "Unclosed parenthesis";
        }

        if (msg.contains("extraneous input")) {
            return "Incorrect instruction order";
        }

        if (msg.contains("mismatched input")) {
            return "Incomplete structure";
        }

        return "Syntax error";
    }

    public void close() throws IOException {
        writer.close();
    }
}