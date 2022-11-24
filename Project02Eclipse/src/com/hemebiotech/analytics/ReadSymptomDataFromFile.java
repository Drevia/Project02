package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Implémentation de l'interface ISymptomsReader pour avoir accès a la fonction GetSymptoms
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * Constructor
	 *
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	/**
	 *
	 * @return List de String contenus dans un fichier du filepath
	 */
	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		
		if (filepath != null) {
			BufferedReader reader = null;
			try {
				reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				while (line != null) {
					//ajout du symptoms lus par le BufferReafrer dans la list de String créé précedemment
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			}catch(FileNotFoundException e){
				System.err.println("The path to the file is incorrect or the file is missing");
			} catch (IOException e) {
				System.err.println("Caught IOException " + e.getMessage());
			}
		}
		return result;
	}

}
