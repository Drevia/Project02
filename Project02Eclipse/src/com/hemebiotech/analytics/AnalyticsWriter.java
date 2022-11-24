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

    /**
     * Permet d'écrire dans un noçuveau fichier les symptoms obtenus
     * grace à AnalyticsCounter et de noter leur nombres d'occurences
     * @param sorted, treeMap contenant l'intégralité des symptoms et permettant
     * de les trier par ordre alphabétique
     * @throws IOException
     */
    public static void writeSymptoms(TreeMap<String, Integer> sorted) throws IOException {
        //creation d'un fichier ou l'on va écrire les résultats de la lectures des symptoms
        FileWriter writer = new FileWriter("results.out");

        //On utilise la treeMap "sorted" pour avoir les symptoms écrits dans l'ordre alphabétique
        for (Map.Entry<String, Integer> entry: sorted.entrySet()) {
            writer.write(entry.getKey() + " = " + entry.getValue() + "\n");
        }
        writer.close();
    }
}
