package dat100.hvl.uke34;

import javax.swing.JOptionPane;

import easygraphics.EasyGraphics;

@SuppressWarnings("serial")
public class Opg6 extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Det tyske flagget");

		int scale = Integer.parseInt(JOptionPane.showInputDialog("Scale:"));

		// Svart (Pantone svart)
		setColor(45, 41, 38);
		fillRectangle(50, 50, 5 * scale, 1 * scale);

		// Rød (Pantone 485)
		setColor(218, 41, 28);
		fillRectangle(50, 50 + 1 * scale, 5 * scale, 1 * scale);

		// Gul (Pantone 7405)
		setColor(242, 205, 0);
		fillRectangle(50, 50 + 2 * scale, 5 * scale, 1 * scale);
	}

}