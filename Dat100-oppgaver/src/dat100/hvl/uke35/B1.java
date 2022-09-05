package dat100.hvl.uke35;

import javax.swing.JOptionPane;

public class B1 {

	public static void main(String[] args) {
		String inputTxt = JOptionPane.showInputDialog(null, "Radius: ");
		double radius = Double.parseDouble(inputTxt);

		double volum = Math.round((4.0 / 3.0) * (Math.PI) * (Math.pow(radius, 3)) * 100) / 100;

		String outputTxt = "Radiusen er: " + radius + "   Volumet er: " + volum;
		JOptionPane.showMessageDialog(null, outputTxt);
	}

}