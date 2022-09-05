package dat100.hvl.uke35;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class G4 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			String tallTxt = showInputDialog("Gi et tall:");
			int tall = parseInt(tallTxt);
			System.out.println(tall);
		}
	}

}