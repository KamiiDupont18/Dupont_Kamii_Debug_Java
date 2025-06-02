package com.hemebiotech.interfaces;

import java.io.IOException;
import java.util.Map;

/**
 * Interface for writing symptom data to a data destination.
 */
public interface ISymptomWriter {
    /**
     * Writes symptom data to the output.
     *
     * @param symptoms a map of symptom names and their occurrence count
     * @throws IOException if writing fails
     */
    void writeSymptoms(Map<String, Integer> symptoms) throws IOException;
}
