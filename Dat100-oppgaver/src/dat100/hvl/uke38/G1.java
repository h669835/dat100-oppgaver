package dat100.hvl.uke38;

public class G1 {

	public static void main(String[] args) {
		int[] tabell = { 1, 3, 4, 7, 9, 10 };
		System.out.println(tabell[2]);
		System.out.println();
		tabell[2] = 7;
		skrivUt(tabell);
		System.out.println();
		System.out.println(finnes(tabell, 9));
		System.out.println();
		skrivUt(skiftfortegn(tabell));
	}

	public static void skrivUt(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i] + ", ");
		}
	}

	public static boolean finnes(int[] tabell, int tall) {
		int i = 0;
		boolean funnet = false;
		while (!funnet) {
			if (tabell[i] == tall) {
				funnet = true;
			}
			i++;
		}
		return funnet;
	}

	public static int[] skiftfortegn(int[] tabell) {
		int[] ny_tabell = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			ny_tabell[i] = -tabell[i];
		}
		return ny_tabell;
	}

}
