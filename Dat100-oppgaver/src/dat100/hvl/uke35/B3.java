package dat100.hvl.uke35;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class B3 {

	public static void main(String[] args) {
		String[][] Brukere = { { "Martin", "Martin123!" }, { "test", "test123" } };

		JTextField brukernavn = new JTextField(5);
		JTextField passord = new JTextField(5);

		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("Brukernavn:"));
		myPanel.add(brukernavn);
		myPanel.add(Box.createHorizontalStrut(15));
		myPanel.add(new JLabel("Passord:"));
		myPanel.add(passord);

		int result = JOptionPane.showConfirmDialog(null, myPanel, "Skriv inn brukernavn og passord.",
				JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			String a = brukernavn.getText();
			String b = passord.getText();

			for (int i = 0; i < Brukere.length; i++) {
				if (a.equals(Brukere[i][0])) {
					if (b.equals(Brukere[i][1])) {
						JOptionPane.showMessageDialog(null, "Logget inn.");
						System.exit(0);
					}
				}
			}
			JOptionPane.showMessageDialog(null, "Ugyldig Brukernavn og Passord kombinasjon.");

		}
	}
}
