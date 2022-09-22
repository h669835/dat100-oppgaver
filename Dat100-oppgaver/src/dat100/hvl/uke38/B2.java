package dat100.hvl.uke38;

import javax.swing.JOptionPane;

public class B2 {

	public static void main(String[] args) {

		int bredde = lesInnTall("Bredde:");
		int hoyde = lesInnTall("Høyde:");

		int a = areal(bredde, hoyde);

		JOptionPane.showMessageDialog(null, "Areal: " + a);
	}

	private static int areal(int bredde, int hoyde) {

		int flateareal = bredde * hoyde;

		return flateareal;
	}

	private static int lesInnTall(String message) {
		int input = 0;
		do {
			input = Integer.parseInt(JOptionPane.showInputDialog(message));
		} while (input < 0);
		return input;
	}

}