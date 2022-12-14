package dat100.hvl.uke34;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Opg1 {
	public static void main(String[] args) {
		JTextField xField = new JTextField(5);
		JTextField yField = new JTextField(5);

		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("x:"));
		myPanel.add(xField);
		myPanel.add(Box.createHorizontalStrut(15));
		myPanel.add(new JLabel("y:"));
		myPanel.add(yField);

		int result = JOptionPane.showConfirmDialog(null, myPanel, "Please Enter X and Y Values",
				JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			JOptionPane.showMessageDialog(null,
					Double.parseDouble(xField.getText()) * Double.parseDouble(yField.getText()));
		}
	}
}