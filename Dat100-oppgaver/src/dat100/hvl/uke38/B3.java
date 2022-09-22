package dat100.hvl.uke38;

import easygraphics.EasyGraphics;

@SuppressWarnings("serial")
public class B3 extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void run() {
		tegn();
	}

	public void tegn() {
		int windowWidth = 500;
		int windowHeight = 300;
		int brickWidth = 20;
		int brickHeight = 10;

		int antall_rader = (windowHeight / brickHeight) + 1;
		int antall_kolonner = (windowWidth / brickWidth) + 1;

		makeWindow("murvegg", windowWidth, windowHeight);
		boolean offset = false;
		for (int i = 0; i < antall_rader; i++) {
			for (int j = 0; j < antall_kolonner; j++) {
				if (offset) {
					drawRectangle(j * brickWidth - (brickWidth / 2), i * brickHeight, brickWidth, brickHeight);
				} else {
					drawRectangle(j * brickWidth, i * brickHeight, brickWidth, brickHeight);
				}
			}

			offset ^= true;
		}
	}

}
