package com.umg.bilingualcode.Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LexicalOutputViewer {

    private static final String BASE_PATH = "output/lexicalOutput/";

    public void showAll() {
        System.out.println("\n===== LEXICAL OUTPUTS =====");

        showFile("Symbol Table", "symbol_table.txt");
        showFile("Lexical Errors", "lexical_errors.txt");
        showFile("Error Identification", "error_identification.txt");
        showFile("Regex Table", "regex_table.txt");
    }

    private void showFile(String title, String fileName) {
        File file = new File(BASE_PATH + fileName);

        System.out.println("\n--- " + title + " ---");

        if (!file.exists()) {
            System.out.println("File not found: " + fileName);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        }
    }
}
