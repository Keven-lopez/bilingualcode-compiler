package com.umg.bilingualcode.Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SemanticOutputViewer {

    private static final String BASE_PATH = "output/syntaxOutput/";

    public void showAll() {
        System.out.println("\n===== SEMANTIC OUTPUTS =====");

        showFile("Syntax Errors", "syntax_errors.txt");
        showFile("Syntax Tree", "syntactic_tree.txt");
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