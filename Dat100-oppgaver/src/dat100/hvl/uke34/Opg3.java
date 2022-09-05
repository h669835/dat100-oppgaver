package dat100.hvl.uke34;

import java.util.regex.Pattern;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Opg3 {
	public static void main(String[] args) {
		Pattern DATE_PATTERN = Pattern.compile("^((2000|2400|2800|(19|2[0-9])(0[48]|[2468][048]|[13579][26]))-02-29)$"
				+ "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
				+ "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
				+ "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");
		JTextField dagJF = new JTextField(5);
		JTextField månedJF = new JTextField(5);
		JTextField årJF = new JTextField(5);

		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("dag: "));
		myPanel.add(dagJF);
		myPanel.add(Box.createHorizontalStrut(15)); // a spacer
		myPanel.add(new JLabel("måned: "));
		myPanel.add(månedJF);
		myPanel.add(Box.createHorizontalStrut(15)); // a spacer
		myPanel.add(new JLabel("år: "));
		myPanel.add(årJF);

		int result = JOptionPane.showConfirmDialog(null, myPanel, "Please Enter X and Y Values",
				JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			String dag = dagJF.getText();
			String måned = månedJF.getText();
			String år = årJF.getText();

			String dato = år + "-" + måned + "-" + dag;

			if (DATE_PATTERN.matcher(dato).matches()) {
				JOptionPane.showMessageDialog(null, dato);
			} else {
				JOptionPane.showMessageDialog(null, "Ugyldig dato");
			}

		}
	}

}