package dat100.hvl.uke38;

public class B1 {

	public static void main(String[] args) {
		int siste_vinkel = 180;
		int steg = 15;
		double[][] resultat = new double[(siste_vinkel / steg) + 1][4];
		int i = 0;
		System.out.printf("%15s %15s %15s %15s\n", "x i grader", "x i radianer", "sin(x)", " cos(x)");
		System.out.println("-".repeat(63));
		for (int grader = 0; grader <= siste_vinkel; grader += 15) {
			resultat[i] = maths(grader);
			print(resultat[i]);
			i++;
		}
		System.out.println("-".repeat(63));

	}

	public static double[] maths(double grader) {
		double[] maths = new double[4];
		maths[0] = grader;
		maths[1] = Math.round((Math.PI * (double) grader / (double) 180) * 1000) / (double) 1000;
		maths[2] = Math.round((Math.sin(maths[1])) * 1000) / (double) 1000;
		maths[3] = Math.round((Math.cos(maths[1])) * 1000) / (double) 1000;

		return maths;
	}

	public static void print(double[] tab) {
		System.out.printf("%15s %15s %15s %15s\n", (int) tab[0], tab[1], tab[2], tab[3]);
	}

}
