package utils;

import java.util.Scanner;

public class ConsoleHandler {
    private static Scanner scanner = new Scanner(System.in);

    public static String getNextLine() {
        return scanner.nextLine();
    }

    public static void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
