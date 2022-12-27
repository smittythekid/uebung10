// Ermitteln Sie die Primzahlen zwischen 1 und 100.000 auf folgende Weise:
// • Eine äußere Schleife zählt von n = 1 bis 100.000.
// • Eine innere Schleife zählt von m = 2 bis n und prüft jeweils per Modulo, ob n durch m ohne Rest teilbar
// 	 ist. Ist das der Fall, bricht die innere Schleife ab.
// • Wenn eine Zahl keine Primzahl ist, geben Sie den ersten Teiler aus.
// • Ansonsten wird die Primzahl ausgegeben (inklusive Zähler)
// Geben Sie zuletzt die Ausführungsdauer des Programms aus.

public class Prim {
	public static void main(String[] args) {
		System.out.println("Primenumbers:  2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97\n");
		
		int count = 0;
		//Beginn Ausführungsdauer
		long startTime = System.nanoTime();;
		
		for (int i = 1; i <= 100000; i++) {
			boolean isPrime = true;
			for (int m = 2; m < i; m++) {
				if (i % m == 0) { // ist teilbar, also keine Primzahl, es wird Modulo gerechnet von zb. i=4: 4%2=0, i%3=1
					isPrime = false;
					System.out.println("Zahl: " + i + " Erster Teiler: " + m);
					break;
				}
			}
			if (isPrime && i != 1) {
				count++;
				System.out.println(count + ". Primzahl: " + i);
			}
		
		}
		//Zeitmessung Start-Ende=Dauer
		long endTime = System.nanoTime();;
		long duration = endTime - startTime;
		System.out.println("Ausführungsdauer: " + duration/1000000 + " Millisekunden");
	}

}
