package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * Anything that can write symptom data to a destination.
 */
public interface ISymptomWriter {
    
    /**
     * Writes the given symptom data to a destination (e.g., file).
     *
     * @param symptoms A map of symptom names and their respective counts
     * @throws IOException if writing fails
     */
    void writeSymptoms(Map<String, Integer> symptoms) throws IOException;
}
