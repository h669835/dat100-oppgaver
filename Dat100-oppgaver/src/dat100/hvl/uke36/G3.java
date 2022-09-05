package dat100.hvl.uke36;
/*
 * a)	
 * Skriv et Java program som bruker en for-løkke med en tellevaribel 
 * i som starter på 1 og løper opp til og med 20
 * 
 * b)
 * Legg til set switch-setning inne i for-løkken slik programmet skriver 
 * ut A hvis i har verdien, 1 og B om i har verdien 2, og C ellers.
 * 
 * c)
 * Modifiser programmet fra b) slik det bruker en valgsetning 
 * (if-then-else) i stedet for en switch-setning.
 */

public class G3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {
			/*
			 * switch (i) { case 1: System.out.println("A"); break; case 2:
			 * System.out.println("B"); break; default: System.out.println("C");
			 * 
			 * }
			 */

			if (i == 1) {
				System.out.println("A");
			} else if (i == 2) {
				System.out.println("B");
			} else {
				System.out.println("C");
			}
		}
	}
}