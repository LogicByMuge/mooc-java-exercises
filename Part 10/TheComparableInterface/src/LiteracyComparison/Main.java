package LiteracyComparison;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Record> records = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("literacy.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                // parts[2] = gender info like "female (%)"
                String gender = parts[2].replace(" (%)", "").trim();
                String country = parts[3].trim();
                int year = Integer.parseInt(parts[4].trim());
                double literacyPercent = Double.parseDouble(parts[5].trim());

                records.add(new Record(country, year, gender, literacyPercent));
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Sort by literacy percentage ascending
        Collections.sort(records);

        // Print results
        for (Record r : records) {
            System.out.println(r);
        }
    }
}