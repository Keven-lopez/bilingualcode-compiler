package com.umg.bilingualcode.Utils;

import java.io.IOException;

public class ConsoleUtils {

    // =========================
    // Clear console
    // =========================
    public static void clearConsole() {
        try {
            String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // ANSI escape (Linux, Mac, IntelliJ)
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }

        } catch (Exception e) {
            // Fallback if clearing fails
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }

    // =========================
    // Pause (press any key)
    // =========================
    public static void waitForUser() {
        System.out.println("\nPress any key to continue...");
        try {
            System.in.read(); // waits for input
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}