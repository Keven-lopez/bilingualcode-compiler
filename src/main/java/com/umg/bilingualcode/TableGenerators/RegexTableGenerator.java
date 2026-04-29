package com.umg.bilingualcode.TableGenerators;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RegexTableGenerator {

    public void generate() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("regex_table.txt"));

        writer.write("TOKEN TYPE\tREGEX\n");
        writer.write("IDENTIFIER\t[a-zA-Z_][a-zA-Z0-9_]*\n");
        writer.write("NUMBER_LITERAL\t[0-9]+('.'[0-9]+)?\n");
        writer.write("STRING_LITERAL\t\".*?\"\n");

        writer.close();
    }
}