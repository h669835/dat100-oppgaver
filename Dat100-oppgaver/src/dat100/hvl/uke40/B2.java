package dat100.hvl.uke40;

import java.util.Arrays;
import java.util.Scanner;

public class B2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner object
		System.out.print("Input: ");
		String inputString = input.nextLine();

		System.out.print("Input mønster: ");
		String pattern = input.nextLine();

		String[] inputAsString = inputString.split(" ");

		int matches = 0;

		for (String ord : inputAsString) {
			System.out.println("Input ord: " + ord);
			System.out.println("Ord Baklengs: " + Baklengs(ord));

			if (ord.contains(pattern)) {
				matches++;
			}
			if (ord.length() == 1) {
				System.out.println("Printer hele ordet: " + ord);
			} else if (ord.length() % 2 == 0) {
				System.out.println("Printer to midterste tegn: " + ord.charAt(ord.length() / 2 - 1)
						+ ord.charAt(ord.length() / 2));
			} else if (ord.length() >= 3) {
				System.out.println("Printer tre midterste tegn: " + ord.charAt(ord.length() / 2 - 1)
						+ ord.charAt(ord.length() / 2) + ord.charAt(ord.length() / 2 + 1));
			}
			System.out.println();
		}

		System.out.println("Matcher mønsteret: " + pattern);
		System.out.println(matches);
	}

	public static String Baklengs(String s) {
		String baklengsString = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			baklengsString += s.charAt(i);
		}
		return baklengsString;
	}

	public static String alfabetisk(String[] s) {
		Arrays.sort(s);
		return s[0];
	}

}
