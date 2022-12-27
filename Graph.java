// Erstellen Sie eine Klasse "Graph", die einen Graphen als Menge beliebiger Punkte abbildet. Der Graph soll mittels der Methode addPunkt mit einzelnen Punkten befüllt werden können, die in der Graph-Klasse in einer ArrayList gespeichert werden (ist es sinnvoll, wenn diese ArrayList statisch ist?).
// Erstellen sie einen Graphen aus 100 Punkten (mit x-Koordinaten von 1 bis 100), bei dem die y-Koordinate eine Zufallszahl zwischen 0 und 10 ist. 
// Ergänzen Sie Aufgabe 10a so, dass die Ausgabe zusätzlich in eine Datei geschrieben wird.

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Graph {
	static ArrayList<Punkt> graph = new ArrayList<Punkt>();

	
	public static void main(String[] args) throws IOException {
		Punkt.addPunkt(10);

		FileWriter writer = new FileWriter("src/graphfile.txt");
		
		for( int i=0; i<graph.size(); i++) {
			writer.write(graph.get(i).toString());
		}
		writer.close();

		System.out.println(graph.toString());
		
	}
}
