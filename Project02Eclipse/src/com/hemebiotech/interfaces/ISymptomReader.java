package com.hemebiotech.interfaces;

import java.util.List;

/**
 * Interface for reading symptom data from a data source.
 * Implementations should return a list of symptoms, possibly containing duplicates.
 */
public interface ISymptomReader {
    /**
     * Reads symptom data.
     *
     * @return a list of raw symptoms, possibly with duplicates; never null
     */
    List<String> GetSymptoms();
}

