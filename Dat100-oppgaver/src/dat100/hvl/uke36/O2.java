package dat100.hvl.uke36;

/*
 * Lag et program som leser inn en poengsum (heltall) som en student har oppnådd på en prøve, 
 * og finn og skriv ut den karakteren A-F dette tilsvarer. 
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class O2 {

	public static void main(String[] args) {

		// Karakterskala.
		String[][] karakterer = { { "0", "F" }, { "40", "E" }, { "50", "D" }, { "60", "C" }, { "80", "B" },
				{ "90", "A" }, { "101" } };

		// Hvor mange inputs ønsker vi å ta.
		int maxInput = 10;
		int inputNr = 0;

		// Oppretter scanner for å ta input.
		Scanner input = new Scanner(System.in);

		// Program loop
		while (inputNr < maxInput) {

			// Henter input via Scanner.
			System.out.println("Student nummer " + (inputNr + 1) + ": Poengsum:");
			String poengstr = input.nextLine();

			// Try for å parse input.
			try {
				int poengsum = Integer.parseInt(poengstr);
				String karakter;

				// Skjekker om poengsum er innenfor gyldig område.
				if (poengsum >= 0 && poengsum <= 100) {

					// Skjekker hvilken karakter vi er innenfor og printer dette.
					for (int i = 0; i < karakterer.length - 1; i++) {
						if (poengsum >= Integer.parseInt(karakterer[i][0])
								&& poengsum < Integer.parseInt(karakterer[i + 1][0])) {
							karakter = karakterer[i][1];
							System.out.println("Karakter: " + karakter + "\n");
							inputNr++;
						}
					}
				} else {

					// Poengsum er utenfor gyldig område.
					System.out.println("Ugyldig poengsum, prøv igjen. \n");
				}
			} catch (NumberFormatException e) {

				// Poengsum er ikke en gyldig double.
				JOptionPane.showMessageDialog(null, "Poengsum er ikke ett tall.");
			} catch (Exception e) {

				// Noe annet gikk feil.
				JOptionPane.showMessageDialog(null, "Noe gikk galt, prøv igjen.\n" + e.getMessage());
			}
		}
		input.close();
	}
}
