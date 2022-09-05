package dat100.hvl.uke35;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class V1 {

	public static void main(String[] args) {
		JTextField aField = new JTextField(5);
		JTextField bField = new JTextField(5);
		JTextField cField = new JTextField(5);

		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("a:"));
		myPanel.add(aField);
		myPanel.add(Box.createHorizontalStrut(15));
		myPanel.add(new JLabel("b:"));
		myPanel.add(bField);
		myPanel.add(Box.createHorizontalStrut(15));
		myPanel.add(new JLabel("c:"));
		myPanel.add(cField);

		int result = JOptionPane.showConfirmDialog(null, myPanel, "Skriv inn tre tall.", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			int a = Integer.parseInt(aField.getText());
			int b = Integer.parseInt(bField.getText());
			int c = Integer.parseInt(cField.getText());

			if (a < b && a < c) {
				// A er størst
				if (b < c) {
					System.out.println(a + "  " + b + "  " + c);
				}
				System.out.println(a + "  " + c + "  " + b);
			}
			if (b < a && b < c) {
				// B er størst
				if (a < c) {
					System.out.println(b + "  " + a + "  " + c);
				}
				System.out.println(b + "  " + c + "  " + a);
			}
			if (c < b && c < c) {
				// C er størst
				if (a < b) {
					System.out.println(c + "  " + a + "  " + b);
				}
				System.out.println(c + "  " + b + "  " + a);
			}

		}

	}

}