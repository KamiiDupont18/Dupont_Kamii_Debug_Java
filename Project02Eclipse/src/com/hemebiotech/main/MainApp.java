package com.hemebiotech.main;

/**
 * Main application to run the AnalyticsCounter.
 */
public class MainApp {
    public static void main(String[] args) {
        String inputFile = "symptoms.txt";
        String outputFile = "result.out";

        SymptomReaderService readerService = new SymptomReaderService(inputFile);
        SymptomCounterService counterService = new SymptomCounterService();
        SymptomWriterService writerService = new SymptomWriterService(outputFile);

        AnalyticsCounter counter = new AnalyticsCounter(readerService, counterService, writerService);
        try {
            counter.execute();
            System.out.println("Symptoms processed successfully.");
        } catch (Exception e) {
            System.err.println("Failed to process symptoms: " + e.getMessage());
        }
    }
}
