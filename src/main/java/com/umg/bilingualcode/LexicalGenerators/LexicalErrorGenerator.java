package com.umg.bilingualcode.LexicalGenerators;

import com.umg.bilingualcode.SpanglishCodeLexer;
import org.antlr.v4.runtime.Token;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class LexicalErrorGenerator {

    private final Set<String> reservedWords = Set.of(
            "start","inicio","finish","fin",
            "define","definir",
            "set","poner",
            "input","entrada",
            "display","mostrar",
            "if","si",
            "then","entonces",
            "while","mientras",
            "function","funcion",
            "return","retornar"
    );

    public void generate(List<Token> tokens) throws IOException {
        BufferedWriter errorWriter = new BufferedWriter(new FileWriter("output/lexical_errors.txt"));
        BufferedWriter reportWriter = new BufferedWriter(new FileWriter("output/error_identification.txt"));

        errorWriter.write(String.format("%-20s %-25s %-10s %-10s%n",
                "LEXEME", "ERROR TYPE", "LINE", "COLUMN"));

        errorWriter.write(String.format("%-20s %-25s %-10s %-10s%n",
                "--------------------", "-------------------------", "----------", "----------"));

        for (Token token : tokens) {

            String errorType = null;

            if (token.getType() == SpanglishCodeLexer.ERROR_CHAR) {
                errorType = "Invalid character";
            }

            else if (token.getType() == SpanglishCodeLexer.INVALID_IDENTIFIER) {
                errorType = "Invalid identifier";
            }

            else if (token.getType() == SpanglishCodeLexer.IDENTIFIER &&
                    isMisspelledReservedWord(token.getText())) {
                errorType = "Misspelled reserved word";
            }

            if (errorType != null) {
                errorWriter.write(String.format("%-20s %-25s %-10d %-10d%n",
                        token.getText(),
                        errorType,
                        token.getLine(),
                        token.getCharPositionInLine()));

                reportWriter.write(String.format("%s '%s' at line %d, column %d%n",
                        errorType,
                        token.getText(),
                        token.getLine(),
                        token.getCharPositionInLine()));
            }
        }

        errorWriter.close();
        reportWriter.close();
    }

    private boolean isMisspelledReservedWord(String word) {
        for (String reserved : reservedWords) {
            if (levenshteinDistance(word, reserved) == 1) {
                return true;
            }
        }
        return false;
    }

    private int levenshteinDistance(String a, String b) {
        int[][] dp = new int[a.length()+1][b.length()+1];

        for (int i = 0; i <= a.length(); i++) dp[i][0] = i;
        for (int j = 0; j <= b.length(); j++) dp[0][j] = j;

        for (int i = 1; i <= a.length(); i++) {
            for (int j = 1; j <= b.length(); j++) {
                int cost = a.charAt(i-1) == b.charAt(j-1) ? 0 : 1;

                dp[i][j] = Math.min(
                        Math.min(dp[i-1][j]+1, dp[i][j-1]+1),
                        dp[i-1][j-1]+cost
                );
            }
        }

        return dp[a.length()][b.length()];
    }
}