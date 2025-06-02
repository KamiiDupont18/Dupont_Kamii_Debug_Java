package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Service that reads symptoms from a file.
 */
public class SymptomReaderService implements ISymptomReader {

    private final String filePath;

    /**
     * Constructs the reader service with the path to the file.
     *
     * @param filePath path to the symptom file
     */
    public SymptomReaderService(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Reads symptoms from a file and returns them as a list.
     *
     * @return list of symptom strings
     */
    @Override
    public List<String> GetSymptoms() {
        List<String> symptoms = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                symptoms.add(line.trim().toLowerCase());
            }
        } catch (IOException e) {
            System.err.println("Error reading symptoms file: " + e.getMessage());
        }
        return symptoms;
    }
}
