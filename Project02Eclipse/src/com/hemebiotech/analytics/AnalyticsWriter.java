package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Permet d'écrire dans un noçuveau fichier les symptoms obtenus
 * grace à AnalyticsCounter et de noter leur nombres d'occurences
 */
public class AnalyticsWriter {
    
    public static void writeSymptoms(TreeMap<String, Integer> sorted) throws IOException {
        FileWriter writer = new FileWriter("results.out");

        for (Map.Entry<String, Integer> entry: sorted.entrySet()) {
            writer.write(entry.getKey() + " = " + entry.getValue() + "\n");
        }
        writer.close();
    }
}
