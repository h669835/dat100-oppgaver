package dat100.hvl.uke36;
/*
 * Lag et program for å finne alle oddetallene fra og med en nedre grense til og med en øvre grense.
 * Grensene skal leses inn ved hjelp av showInputDialog og resultatet vises ved bruk av showMessageDialog.
 */

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class B1 {

	public static void main(String[] args) {

		// Lager to text felt for å ta input.
		JTextField minField = new JTextField(5);
		JTextField maxField = new JTextField(5);

		// Lager et panel og legger til text feltene.
		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("Min: "));
		myPanel.add(minField);
		myPanel.add(Box.createHorizontalStrut(15));
		myPanel.add(new JLabel("Max: "));
		myPanel.add(maxField);

		// Henter verdier fra panel når ok knappen klikkes.
		int result = JOptionPane.showConfirmDialog(null, myPanel, "Venligst oppgi min og max veri",
				JOptionPane.OK_CANCEL_OPTION);

		// Om ok klikkes.
		if (result == JOptionPane.OK_OPTION) {

			// Parser string inputs.
			int min = Integer.parseInt(minField.getText());
			int max = Integer.parseInt(maxField.getText());

			// Lager en tom string for resultatet.
			String resultat = "";

			// Max bredde, for å unngå å printe alle tallene på en linje.
			int mw = 150, w = 0;

			// Gå gjennom alle tall mellom min og max.
			for (int i = min; i <= max; i++) {

				// Skjekke om tallene er oddetall.
				if (i % 2 != 0) {

					// Legge tallet til i resultat variablen om det er ett oddetall.
					resultat = resultat + i + ", ";

					// Legger til lengden av tallet i bredde variablen.
					w += (int) (Math.log10(Math.abs(i)) + 3);
				}
				// Legger til ny linje om bredden er over max bredde.
				if (w > mw) {
					resultat = resultat + "\n";
					w = 0;
				}
			}

			// Presenterer resultater.
			String outTxt = "Nedre grense: " + min + "\nØvre grense: " + max + "\nResultat: " + resultat;
			JOptionPane.showMessageDialog(null, outTxt);
		}

	}

}
