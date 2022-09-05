package dat100.hvl.uke35;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class G3 {
	public static void main(String[] args) {
		JTextField aField = new JTextField(5);
		JTextField bField = new JTextField(5);

		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("a:"));
		myPanel.add(aField);
		myPanel.add(Box.createHorizontalStrut(15));
		myPanel.add(new JLabel("b:"));
		myPanel.add(bField);

		int result = JOptionPane.showConfirmDialog(null, myPanel, "Skriv inn a og b verdier.",
				JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			int a = Integer.parseInt(aField.getText());
			int b = Integer.parseInt(bField.getText());
			if (b == 0) {
				JOptionPane.showMessageDialog(null, "Kan ikke dele på 0");
			} else {
				JOptionPane.showMessageDialog(null, a / b);
			}
		}
	}
}