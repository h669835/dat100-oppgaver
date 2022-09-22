package dat100.hvl.uke38;

import javax.swing.JOptionPane;

import easygraphics.EasyGraphics;

@SuppressWarnings("serial")
public class B5 extends EasyGraphics {

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void run() {
		int ant = Integer.parseInt(JOptionPane.showInputDialog("Antall sirkler: "));
		tegn(ant);
	}

	public void tegn(int antall_sirkler) {
		int windowWidth = 500;
		int windowHeight = 500;
		int circleWidth = (windowWidth - 50) / (antall_sirkler * 2);

		makeWindow("Målskive", windowWidth, windowHeight);
		boolean black = false;
		for (int i = 0; i < antall_sirkler * 2; i++) {
			if (black) {
				setColor(0, 0, 0);
			} else {
				setColor(255, 255, 255);
			}
			fillCircle(windowWidth / 2, windowHeight / 2, (antall_sirkler * 2 - i) * (circleWidth / 2));

			black ^= true;
		}
	}

}
