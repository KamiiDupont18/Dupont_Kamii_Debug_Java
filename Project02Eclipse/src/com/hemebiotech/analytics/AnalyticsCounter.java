package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The main class responsible for counting symptoms from a data source and writing the results to a file.
 */
public class AnalyticsCounter {

    /**
     * Entry point of the program.
     * 
     * @param args Not used.
     * @throws IOException if reading or writing files fails.
     */
    public static void main(String[] args) throws IOException {

        // Load symptoms from file
        ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
        List<String> symptoms = reader.GetSymptoms(); // get all symptoms as a list

        // Count occurrences of each symptom
        Map<String, Integer> symptomCounts = new HashMap<>();

        for (String symptom : symptoms) {
            symptom = symptom.toLowerCase(); //* Ensure case-insensitive comparison

            // Increment count or add new entry
            symptomCounts.put(symptom, symptomCounts.getOrDefault(symptom, 0) + 1);
        }

        // Write result to output file
        try (FileWriter writer = new FileWriter("result.out")) {
            for (Map.Entry<String, Integer> entry : symptomCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        }

        // Inform the user
        System.out.println("Symptoms have been counted and written to result.out");
    }
}
