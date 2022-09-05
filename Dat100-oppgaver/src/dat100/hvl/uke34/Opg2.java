package dat100.hvl.uke34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Opg2 {
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Input");

		input.replaceAll("\\s+", "");

		List<String> inputs = Arrays.asList(input.split(","));

		List<Integer> inputsAsInt = new ArrayList<>();
		for (int i = 0; i < inputs.size(); i++) {
			inputsAsInt.add(Integer.parseInt(inputs.get(i)));
		}

		Collections.sort(inputsAsInt);

		List<Integer> output = new ArrayList<>();
		for (int i = 0; i < inputsAsInt.size(); i++) {
			if (i > 4) {
				break;
			}
			output.add(inputsAsInt.get(i));
		}

		JOptionPane.showMessageDialog(null, output);
	}
}