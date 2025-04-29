package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvHandler {

    public static List<List<String>> read(String filePath) {
        List<List<String>> content = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split line by commas, but handle quoted values
                List<String> rowList = new ArrayList<>();
                String[] columns = splitLine(line);
                for (String column : columns) {
                    rowList.add(column);
                }
                content.add(rowList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

    public static void append(String filePath, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(data);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[] splitLine(String line) {
        List<String> columns = new ArrayList<>();
        StringBuilder currentField = new StringBuilder();
        boolean insideQuotes = false;
        char[] chars = line.toCharArray();

        for (char c : chars) {
            if (c == '"') {
                // Toggle the state of being inside quotes
                insideQuotes = !insideQuotes;
            } else if (c == ',' && !insideQuotes) {
                // If we encounter a comma outside quotes, add the current field to the list
                columns.add(currentField.toString().trim());
                currentField = new StringBuilder();  // Reset the current field
            } else {
                // Otherwise, just add the character to the current field
                currentField.append(c);
            }
        }
        // Add the last field after finishing the line
        columns.add(currentField.toString().trim());

        return columns.toArray(new String[0]);
    }

}
