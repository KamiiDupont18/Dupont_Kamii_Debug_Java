package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Writes symptom data to a file.
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

    private final String outputFilePath;

    /**
     * Constructor
     *
     * @param outputFilePath the full path of the file to write the data to
     */
    public WriteSymptomDataToFile(String outputFilePath) {
        this.outputFilePath = outputFilePath;
    }

    /**
     * Writes the symptom data into a file, one line per symptom.
     *
     * @param symptoms A map of symptom names and their counts
     * @throws IOException if the writing fails
     */
    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) throws IOException {
        try (FileWriter writer = new FileWriter(outputFilePath)) {
            for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        }
    }
}
