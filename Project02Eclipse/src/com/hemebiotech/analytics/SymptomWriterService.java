package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Service that writes symptoms and their counts to a file.
 */
public class SymptomWriterService implements ISymptomWriter {

    private final String filePath;

    /**
     * Constructs the writer service with the output file path.
     *
     * @param filePath path to the output file
     */
    public SymptomWriterService(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Writes symptoms and their counts to a file.
     *
     * @param symptoms map of symptoms and their counts
     * @throws IOException if writing to the file fails
     */
    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        }
    }
}
