package dat100.hvl.uke39;

public class G1 {

	public static void main(String[] args) {

		double[][] obs = { { 1.4, 1.7, 1.9, 2.0 }, { 5.4, 7.8, 9.8, 7.9, 3.0 }, { -1.7, -1.7, -2.8 } };

		skrivUt(obs);

		System.out.println(obs.length); // 3 ettersom det er 3 elementer i obs.
		System.out.println(obs[0].length); // 4 ettersom det er 4 elementer i obs[0];
		System.out.println(obs[1].length); // 5 ettersom det er 5 elementer i obs[1];
		System.out.println(obs[2].length); // 3 ettersom det er 3 elementer i obs[2];

		double[] temp = obs[0];
		obs[0] = obs[2];
		obs[2] = temp;

		skrivUt(obs);

	}

	public static void skrivUt(double[][] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			for (int j = 0; j < tabell[i].length; j++) {
				System.out.print(tabell[i][j] + ", ");
			}
			System.out.println();
		}
	}

	public static boolean finnes(double[][] obs, double limit) {
		for (int i = 0; i < obs.length; i++) {
			for (int j = 0; j < obs[i].length; j++) {
				if (obs[i][j] > limit) {
					return true;
				}
			}
		}
		return false;
	}

}