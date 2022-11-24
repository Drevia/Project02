package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

/**
 * Main class qui crééer une nouvelle instance d'AnalyticsCounter
 * a chaque lancement et appelle les autres classes afin de compter
 * et créer le fichier results.out
 */
public class Main {

    public static void main(String[] args) throws IOException {
        AnalyticsCounter counter = new AnalyticsCounter();
        TreeMap<String, Integer> countedSymptoms = counter.countSymptoms();
        AnalyticsWriter.writeSymptoms(countedSymptoms);
    }
}
