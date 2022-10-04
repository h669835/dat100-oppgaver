package dat100.hvl.uke40.B1;

import java.util.Arrays;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {

		double[] priser = new double[varer.length];
		for (int i = 0; i < varer.length; i++) {
			priser[i] = varer[i].pris;
		}
		Arrays.sort(priser);
		for (Vare vare : varer) {
			if (vare.pris == priser[0]) {
				return vare;
			}
		}
		return null;

	}

	public static double totalPris(Vare[] varer) {

		double totalpris = 0;
		for (Vare vare : varer) {
			totalpris += vare.pris;
		}
		return totalpris;
	}

	public static int[] finnVarenr(Vare[] varer) {

		int[] varenummer = new int[varer.length];
		for (int i = 0; i < varer.length; i++) {
			varenummer[i] = varer[i].varenr;
		}
		return varenummer;

	}

	public static double[] finnPrisDifferanser(Vare[] varer) {

		double[] prisDiff = new double[varer.length - 1];
		for (int i = 0; i < varer.length - 1; i++) {
			prisDiff[i] = -(varer[i].pris - varer[i + 1].pris);
		}
		return prisDiff;
	}
}