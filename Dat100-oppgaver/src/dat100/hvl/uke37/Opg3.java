package dat100.hvl.uke37;

import easygraphics.EasyGraphics;

@SuppressWarnings("serial")
public class Opg3 extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void run() {
		String[][] fordeling = { { "28", "A" }, { "38", "B" }, { "46", "C" } };
		makeDiagram(fordeling);
	}

	public void makeDiagram(String[][] fordeling) {
		int barHeight = 100;
		int spacing = 40;
		int antallDiagram = fordeling.length;
		int windowWidth = 500;
		int labelYOffset = 15;
		int labelXOffset = -5;

		makeWindow("Linjediagram", windowWidth, (antallDiagram * (barHeight + spacing) + spacing));
		drawString("Gutter", 5, 15);
		drawString("Jenter", windowWidth - 40, 15);
		for (int i = 0; i < fordeling.length; i++) {
			int j = Integer.parseInt(fordeling[i][0]);
			drawString(fordeling[i][1], (windowWidth / 2) + labelXOffset,
					(i * (barHeight + spacing) + labelYOffset + (spacing / 2)));
			setColor(0, 255, 0);
			fillRectangle(0, i * (barHeight + spacing) + spacing, (j * windowWidth) / 100, barHeight);
			setColor(255, 0, 0);
			fillRectangle((j * windowWidth) / 100, i * (barHeight + spacing) + spacing, ((100 - j) * windowWidth) / 100,
					barHeight);
			setColor(0, 0, 0);
			drawRectangle(0, i * (barHeight + spacing) + spacing, windowWidth, barHeight);
			drawString(j + "%", 5, ((i + 1) * (barHeight + spacing) + labelYOffset));
			drawString((100 - j) + "%", windowWidth - 40, ((i + 1) * (barHeight + spacing) + labelYOffset));
		}

	}

}
