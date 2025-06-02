package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Coordinates symptom reading, counting, sorting, and writing.
 */
public class AnalyticsCounter {

    private final SymptomReaderService readerService;
    private final SymptomCounterService counterService;
    private final SymptomWriterService writerService;

    /**
     * Constructs the counter with its required services.
     *
     * @param readerService  service for reading symptoms
     * @param counterService service for counting and sorting symptoms
     * @param writerService  service for writing results
     */
    public AnalyticsCounter(SymptomReaderService readerService,
                            SymptomCounterService counterService,
                            SymptomWriterService writerService) {
        this.readerService = readerService;
        this.counterService = counterService;
        this.writerService = writerService;
    }

    /**
     * Executes the complete process: read, count, sort, write.
     *
     * @throws IOException if writing fails
     */
    public void execute() throws IOException {
        List<String> symptoms = readerService.GetSymptoms();
        Map<String, Integer> counted = counterService.countSymptoms(symptoms);
        Map<String, Integer> sorted = counterService.sortSymptoms(counted);
        writerService.writeSymptoms(sorted);
    }
}
