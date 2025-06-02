package com.hemebiotech.main;

import java.util.*;

/**
 * Service that counts and sorts symptoms.
 */
public class SymptomCounterService {

    /**
     * Counts the occurrences of each symptom in the list.
     *
     * @param symptoms list of symptom strings
     * @return map of symptom names to their counts
     */
    public Map<String, Integer> countSymptoms(List<String> symptoms) {
        Map<String, Integer> symptomCounts = new HashMap<>();
        for (String symptom : symptoms) {
            symptom = symptom.toLowerCase();
            symptomCounts.put(symptom, symptomCounts.getOrDefault(symptom, 0) + 1);
        }
        return symptomCounts;
    }

    /**
     * Sorts symptoms alphabetically.
     *
     * @param symptoms map of symptoms and counts (unsorted)
     * @return sorted map of symptoms and counts
     */
    public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
        return new TreeMap<>(symptoms);
    }
}
