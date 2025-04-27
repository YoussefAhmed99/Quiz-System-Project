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
                String[] row = line.split(",");
                List<String> rowList = new ArrayList<>();
                for (String column : row) {
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

}
