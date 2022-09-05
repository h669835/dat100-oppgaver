package dat100.hvl.uke34;

import javax.swing.JOptionPane;

public class Opg4 {

	public static void main(String[] args) {
		int input = Integer.parseInt(JOptionPane.showInputDialog("Sekunder: "));

		/*
		 * Bruker "input % 60" dette deler inputtet på 60 og gir oss resten, altså gir
		 * oss sekundene som ikke inngår i hele minutter. Bruker "(input/60) % 60" samme
		 * konseptet her, vi tar sekundene, deler på 60 for å få minutter og bruker
		 * modulo for få alle minuttene som ikke går opp i hele timer. For å få timer
		 * bare deler vi på 60 to ganger.
		 */

		int sekunder = input % 60;
		int minutter = (input / 60) % 60;
		int timer = (input / 60) / 60;

		String output = "Timer: " + timer + " Minutter: " + minutter + " Sekunder: " + sekunder;

		JOptionPane.showMessageDialog(null, output);

	}
}