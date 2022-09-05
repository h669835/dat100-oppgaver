package dat100.hvl.uke36;

/*
 * Oppgave O3 - Obligatorisk innlevering
 * 	
 * Lag et program som leser inn et heltall n > 0, 
 * beregner verdien n! (n fakultet) og 
 * skriver verdien til n! ut på skjermen, der n! = 1*2*3* … *(n-1)*n.
 */
import javax.swing.JOptionPane;

public class O3 {
	public static void main(String[] args) {

		// Tar input.
		String inputStr = JOptionPane.showInputDialog("Tall: ");

		// Try for å parse input.
		try {
			double inputDouble = Double.parseDouble(inputStr);

			// Sjekker om input er innenfor gyldig område.
			if (inputDouble <= 170 && inputDouble >= 1) {
				double løsning = 1;

				// Regner ut fakultet av "inputDouble"
				for (double i = 1; i <= inputDouble; i++) {
					løsning *= i;
				}

				// Viser resultat.
				JOptionPane.showMessageDialog(null, løsning);

			} else {

				// Input er ikke innenfor gyldig område.
				JOptionPane.showMessageDialog(null, "Ugyldig tall, 1<=n<=170");
			}
		} catch (NumberFormatException e) {

			// Input er ikke en gyldig double.
			JOptionPane.showMessageDialog(null, "Input er ikke ett tall.");
		} catch (Exception e) {

			// Noe annet gikk feil.
			JOptionPane.showMessageDialog(null, "Noe gikk galt, prøv igjen.\n" + e.getMessage());
		}
	}

}
