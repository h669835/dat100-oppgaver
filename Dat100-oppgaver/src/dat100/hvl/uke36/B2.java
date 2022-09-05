package dat100.hvl.uke36;

/*
 * For å regne ut verdien xn, 
 * der n er et positivt heltall og x har en reell (double) verdi, 
 * kan du bruke funksjonen Math.pow(x,n) i Math-klassen. 
 * Dokumentasjon for Math-klassen finnes via https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/Math.html
 * 
 * Men du kan også lage en program-løkke vha. 
 * en while-setning der du regner ut xn direkte ved å starte med å sette en variabel til 1.0, 
 * og deretter multipliserer den med x så mange ganger som n-verdien er.
 * 
 * Lag en klasse der du i main-metoden regner ut xn på begge måter. 
 * Verdier til x og n skal leses inn fra tastaturet (dialogboks). 
 * Skriv ut resultatet med forklarende tekst.
 * 
 * Kjør programmet flere ganger med ulike inndata inkludert tilfeller der talet x har desimaler. 
 * Får du alltid det samme resultatet på begge måter?
 */
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class B2 {

	public static void main(String[] args) {
		// Lager to text felt for å ta input.
		JTextField grunntallField = new JTextField(5);
		JTextField eksponentField = new JTextField(5);

		// Lager et panel og legger til text feltene.
		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("Grunntall: "));
		myPanel.add(grunntallField);
		myPanel.add(Box.createHorizontalStrut(15));
		myPanel.add(new JLabel("Eksponent: "));
		myPanel.add(eksponentField);

		// Henter verdier fra panel når ok knappen klikkes.
		int result = JOptionPane.showConfirmDialog(null, myPanel, "Venligst oppgi grunntall og eksponent",
				JOptionPane.OK_CANCEL_OPTION);

		// Om ok klikkes.
		if (result == JOptionPane.OK_OPTION) {

			// Parser inputs.
			double grunntall = Double.parseDouble(grunntallField.getText());
			int eksponent = Integer.parseInt(eksponentField.getText());

			// Regner ut n^x ved å bruke Math.pow.
			double resultatMathPow = Math.pow(grunntall, eksponent);

			double resultatForLøkke = 1.0;

			// Regner ut n^x ved å bruke en for løkke.
			for (int i = 1; i <= eksponent; i++) {
				resultatForLøkke *= grunntall;
			}

			// Presenterer resultat.
			String outTxt = "Grunntallet er: " + grunntall + "\nEksponenten er: " + eksponent
					+ "\nResultat ved math.pow: " + resultatMathPow + "\nResultat for løkke: " + resultatForLøkke;

			JOptionPane.showMessageDialog(null, outTxt);
		}

		/*
		 * Ser ut til å få samme svar med begge metoder.
		 */
	}

}
