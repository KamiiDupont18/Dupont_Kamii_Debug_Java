package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.*;

/**
 * Main class that reads symptoms, counts them, and writes results.
 */
public class AnalyticsCounter {

    public static void main(String[] args) throws IOException {

        // Read symptoms from file
        ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
        List<String> symptoms = reader.GetSymptoms();

        // Count symptoms
        Map<String, Integer> symptomCounts = new TreeMap<>(); // TreeMap to keep entries sorted alphabetically

        for (String symptom : symptoms) {
            symptom = symptom.toLowerCase(); //* Normalize case
            symptomCounts.put(symptom, symptomCounts.getOrDefault(symptom, 0) + 1);
        }

        // Write symptoms to file
        ISymptomWriter writer = new WriteSymptomDataToFile("result.out");
        writer.writeSymptoms(symptomCounts);

        System.out.println("Symptoms counted and written to result.out");
    }
}
