// Erstellen Sie eine Klasse "Punkt", die einen zweidimensionalen Punkt mittels ganzzahliger x- und y-Koordinaten abbildet. 
// Dem Konstruktor sollen die Koordinaten übergeben werden. 
// Ein einzelner Punkt soll mittels toString z.B. folgendermaßen ausgegeben werden: (x=2, y=8).
// Der Graph soll mittels der Methode addPunkt mit einzelnen Punkten befüllt werden können, 
// die in der Graph-Klasse in einer ArrayList gespeichert werden (ist es sinnvoll, wenn diese ArrayList statisch ist?).


public class Punkt {
	
	int a;
	int b;

	
	//Konstruktor
	Punkt(int a, int b){
		this.a = a;
		this.b = b;		
	}
	
	
	@Override
	public String toString() {
		return ". Punkt: (x = " + a + ", y = " + b + ")\n";
	}	
	
	// Methode befüllt AL mit einzelnen Punkten, int c wird im Methodenaufruf übergeben und gibt die Anzahl der Punkte an (Schleifendurchläufe)
	// Methode gibt dann einzeln die Punkte in die AL weiter
	public static void addPunkt(int c){
		
		while(c != 0) {
			int x = (int) (Math.random() * 100) + 1;
			int y = (int) (Math.random() * 10) + 0; 
			Punkt dot = new Punkt(x,y);
			Graph.graph.add(dot);
			c--;			
		}
	}
		
}
