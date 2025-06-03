package com.hemebiotech.main;

import com.hemebiotech.interfaces.ISymptomWriter;
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
        // Use try-with-resources to ensure the FileWriter is closed properly
        try (FileWriter writer = new FileWriter(filePath)) {
            //* Efficiently writes each symptom entry in "symptom: count" format
            for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        }
    }
}

