package dat100.hvl.uke36;

/*
 * a)
 * Legg til en deklarasjon av en variabel n of typen heltall (int) i main-metoden.
 * 
 * b)
 * Legg til en for-løkke som skriver ut tallene fra 1 opptil 10. 
 * Kjør programmet å se at det fungerer.
 * 
 * c)
 * Modifiser for-løkken slik den skriver tallene fra 1 opptil med ikke med verdien av variabelen n. 
 * Kjør programmet der du en gir n forskjellige verdier og se at programmet gir korrekt utskrift. 
 * Hva skjer om n settes til en negativ verdi?
*/

public class G1 {

	public static void main(String[] args) {
		int n = -10;

		for (int i = 1; i < n; i++) {
			System.out.println(i);
		}

		/*
		 * Om n er negativ, er i alltid mindre enn n, så ingneting printes.
		 */

	}

}
