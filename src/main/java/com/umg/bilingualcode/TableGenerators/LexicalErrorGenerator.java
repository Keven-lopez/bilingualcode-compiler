package com.umg.bilingualcode.TableGenerators;

import com.umg.bilingualcode.SpanglishCodeLexer;
import org.antlr.v4.runtime.Token;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LexicalErrorGenerator {

    public void generate(List<Token> tokens) throws IOException {
        BufferedWriter errorWriter = new BufferedWriter(new FileWriter("output/lexical_errors.txt"));
        BufferedWriter reportWriter = new BufferedWriter(new FileWriter("output/error_identification.txt"));

        errorWriter.write(String.format("%-10s %-10s %-10s%n", "LEXEME", "LINE", "COLUMN"));
        errorWriter.write(String.format("%-10s %-10s %-10s%n", "----------", "----------", "----------"));

        for (Token token : tokens) {
            if (token.getType() == SpanglishCodeLexer.ERROR_CHAR) {

                errorWriter.write(String.format("%-10s %-10d %-10d%n",
                        token.getText(),
                        token.getLine(),
                        token.getCharPositionInLine()));

                reportWriter.write(String.format("Invalid character '%s' at line %d, column %d%n",
                        token.getText(),
                        token.getLine(),
                        token.getCharPositionInLine()));
            }
        }

        errorWriter.close();
        reportWriter.close();
    }
}