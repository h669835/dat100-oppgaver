package dat100.hvl.uke35;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class B2 {

	public static void main(String[] args) {
		JTextField aField = new JTextField(5);
		JTextField bField = new JTextField(5);

		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("Pris:"));
		myPanel.add(aField);
		myPanel.add(Box.createHorizontalStrut(15));
		myPanel.add(new JLabel("Betalt:"));
		myPanel.add(bField);

		int result = JOptionPane.showConfirmDialog(null, myPanel, "Skriv inn pris og beløp.",
				JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			int a = Integer.parseInt(aField.getText());
			int b = Integer.parseInt(bField.getText());

			int tilbakebetaling = b - a;
			int tiKroner = tilbakebetaling / 10;
			int kronestykker = tilbakebetaling - tiKroner * 10;

			String outputTxt = "Pris: " + a + "   Betalt: " + b + "   Tikroner tilbake: " + tiKroner
					+ "   Kronestykker tilbake: " + kronestykker;
			JOptionPane.showMessageDialog(null, outputTxt);
		}

	}

}