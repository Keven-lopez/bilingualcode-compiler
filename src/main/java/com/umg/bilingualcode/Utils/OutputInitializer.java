package com.umg.bilingualcode.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OutputInitializer {

    public static void initialize() {
        try {
            // Main output folder
            Files.createDirectories(Path.of("output"));

            // Subfolders
            Files.createDirectories(Path.of("output/lexicalOutput"));
            Files.createDirectories(Path.of("output/syntaxOutput"));

        } catch (IOException e) {
            System.err.println("Error creating output directories: " + e.getMessage());
        }
    }
}