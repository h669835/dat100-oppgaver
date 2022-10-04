package dat100.hvl.uke40;

import java.util.Arrays;

public class V1 {

	public static void main(String[] args) {
		int[][] tabell = { { 1, 2, 3 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 8, 9, 6 } };
		skrivUt(tabell);
	}

	public static void skrivUt(int[][] tabell) {
		for (int[] liste : tabell) {
			System.out.println(Arrays.toString(liste));
		}
	}

}
