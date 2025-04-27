package utils;

import java.util.Scanner;

public class ConsoleHandler {
    static private Scanner scanner = new Scanner(System.in);

    public String getNextLine() {
        return scanner.nextLine();
    }

    public void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
