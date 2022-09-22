package dat100.hvl.uke38;

import java.util.Scanner;

public class B4 {

	public static void main(String[] args) {
		double[] temperaturer = new double[9];
		System.out.println("Analyse av temperaturer");
		System.out.println("*".repeat(23));
		double[] inputs = takeinput();
		double gjennomsnitt = 0;
		double max = 0;
		for (int i = 0; i < inputs.length; i++) {
			temperaturer[i] = inputs[i];
			gjennomsnitt += inputs[i];
			if (max < inputs[i]) {
				max = inputs[i];
			}
		}
		temperaturer[7] = gjennomsnitt / 7;
		temperaturer[8] = max;

		print(temperaturer);
	}

	public static double[] takeinput() {
		Scanner input = new Scanner(System.in);
		double[] inputs = new double[7];
		System.out.println("Skriv inn temperaturene: ");
		for (int i = 0; i < inputs.length; i++) {
			System.out.print((i + 1) + ". dag: ");
			inputs[i] = input.nextDouble();
		}
		return inputs;
	}

	public static void print(double[] temperaturer) {
		System.out.println("Gjenomsnittstemperaturen var " + Math.round(temperaturer[7] * 100) / 100 + " grader.");
		System.out.println("Maksimum for denne uken var " + Math.round(temperaturer[8] * 100) / 100 + " grader.");
	}

}
