package com.umg.bilingualcode.TableGenerators;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RegexTableGenerator {

    public void generate() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output/regex_table.txt"));

        writer.write(String.format("%-20s %-50s%n", "TOKEN TYPE", "REGEX"));
        writer.write(String.format("%-20s %-50s%n", "--------------------", "--------------------------------------------------"));

        // Identifiers
        writer.write(String.format("%-20s %-50s%n",
                "IDENTIFIER",
                "[a-zA-Z_][a-zA-Z0-9_]*"));

        // Numbers
        writer.write(String.format("%-20s %-50s%n",
                "NUMBER",
                "[0-9]+(\\.[0-9]+)?"));

        // Strings
        writer.write(String.format("%-20s %-50s%n",
                "STRING",
                "\".*?\""));

        // Operators
        writer.write(String.format("%-20s %-50s%n",
                "OPERATORS",
                "\\+ | - | \\* | / | == | != | < | > | <= | >= | ="));

        // Reserved words
        writer.write(String.format("%-20s %-50s%n",
                "RESERVED_WORDS",
                "start|inicio|finish|fin|define|definir|set|poner|if|si|while|mientras|function|funcion"));

        // Comments
        writer.write(String.format("%-20s %-50s%n",
                "COMMENTS",
                "//.*"));

        // Delimiters
        writer.write(String.format("%-20s %-50s%n",
                "DELIMITERS",
                "\\(|\\)|\\{|\\}|;|,"));

        writer.close();
    }
}