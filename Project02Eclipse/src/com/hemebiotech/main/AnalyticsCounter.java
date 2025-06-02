package com.hemebiotech.main;

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
        //* Dependency injection of service instances
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
        //* Get raw data for processing
        List<String> symptoms = readerService.GetSymptoms();

        //* Transform raw list into a frequency map
        Map<String, Integer> counted = counterService.countSymptoms(symptoms);

        //* Prepare sorted results for output
        Map<String, Integer> sorted = counterService.sortSymptoms(counted);

        //* Write the sorted symptom counts to the output file
        writerService.writeSymptoms(sorted);
    }
}
