package com.umg.bilingualcode;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import com.umg.bilingualcode.Compilation.CompilerEngine;
import com.umg.bilingualcode.Utils.*;

public class UI {

    private static String loadedFilePath = null;

    public static void main(String[] args) {
        try {
            OutputInitializer.initialize();
            Scanner scanner = new Scanner(System.in);
            int option;

            do {
                ConsoleUtils.clearConsole();
                System.out.println("""
                          _____                         _       _      _____          _     \s
                         / ____|                       | |     | |    / ____|        | |    \s
                        | (___  _ __   __ _ _ __   __ _| |_ ___| |__ | |     ___   __| | ___\s
                         \\___ \\| '_ \\ / _` | '_ \\ / _` | | / __| '_ \\| |    / _ \\ / _` |/ _ \\
                         ____) | |_) | (_| | | | | (_| | | \\__ \\ | | | |___| (_) | (_| |  __/
                        |_____/| .__/ \\__,_|_| |_|\\__, |_|_|___/_| |_|\\_____\\___/ \\__,_|\\___|
                               | |                 __/ |                                    \s
                               |_|                |___/                                      
""");
                System.out.println("Version 1.0 - Bilingual Programming Language");
                System.out.println("===== SPANGLISHCODE COMPILER =====");
                System.out.println("1. Load file");
                System.out.println("2. Compile and execute");
                System.out.println("3. Show lexical outputs");
                System.out.println("4. Show semantical outputs");
                System.out.println("5. Show language guide");
                System.out.println("0. Exit");
                System.out.print("Select an option: ");

                option = scanner.nextInt();
                scanner.nextLine(); // clear buffer

                switch (option) {

                    case 1:
                        loadFile(scanner);
                        ConsoleUtils.waitForUser();
                        break;

                    case 2:
                        compileAndExecute();
                        ConsoleUtils.waitForUser();
                        break;

                    case 3:
                        showLexicalOutputs();
                        ConsoleUtils.waitForUser();
                        break;

                    case 4:
                        showSemanticalOutputs();
                        ConsoleUtils.waitForUser();
                        break;

                    case 5:
                        showLanguageGuide();
                        ConsoleUtils.waitForUser();
                        break;

                    case 0:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid option.");
                        ConsoleUtils.waitForUser();
                }

            } while (option != 0);

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // =========================
    // OPTION 1: Load File
    // =========================
    private static void loadFile(Scanner scanner) {
        System.out.print("Enter file path: ");
        String path = scanner.nextLine();

        File file = new File(path);

        if (file.exists() && file.isFile()) {
            loadedFilePath = path;
            System.out.println("File loaded successfully.");
        } else {
            System.out.println("File not found.");
        }
    }

    // =========================
    // OPTION 2: Compile & Execute
    // =========================
    private static void compileAndExecute() {
        if (loadedFilePath == null) {
            System.out.println("No file loaded.");
            return;
        }

        CompilerEngine engine = new CompilerEngine();
        engine.compileAndExecute(loadedFilePath);
    }

    // =========================
    // OPTION 3: Lexical Outputs
    // =========================
    private static void showLexicalOutputs() {
        LexicalOutputViewer viewer = new LexicalOutputViewer();
        viewer.showAll();
    }

    // =========================
    // OPTION 4: Semantical Outputs
    // =========================
    private static void showSemanticalOutputs() {
        SemanticOutputViewer viewer = new SemanticOutputViewer();
        viewer.showAll();
    }

    private static void showLanguageGuide() {
        GrammarInfoViewer viewer = new GrammarInfoViewer();
        viewer.show();
    }
}