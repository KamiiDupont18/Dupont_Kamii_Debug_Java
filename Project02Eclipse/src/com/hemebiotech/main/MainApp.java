package com.hemebiotech.main;

/**
 * Main application to run the AnalyticsCounter.
 */
public class MainApp {
    public static void main(String[] args) {
        String inputFile = "symptoms.txt"; //! Entry point for text file input
        String outputFile = "result.out"; //! Entry point for text file output

        //* Responsible for loading raw symptom data
        SymptomReaderService readerService = new SymptomReaderService(inputFile);
        //* Processes symptom data to count occurrences and sort them
        SymptomCounterService counterService = new SymptomCounterService();
        //* Handles persistence of results
        SymptomWriterService writerService = new SymptomWriterService(outputFile);

        //* Orchestrates the overall workflow: read, count, sort, write
        AnalyticsCounter counter = new AnalyticsCounter(readerService, counterService, writerService);
        
        try {
            // Execute the full symptom analysis pipeline
            counter.execute();
            System.out.println("Symptoms processed successfully."); // // Success message
        } catch (Exception e) {
            // Catch any exception and output an error message
            //* Ensures program robustness by handling unexpected failures
            System.err.println("Failed to process symptoms: " + e.getMessage());
        }
    }
}
