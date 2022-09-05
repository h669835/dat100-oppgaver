package dat100.hvl.uke34;

public class Opg5 {
	public static void main(String[] args) {

		int a = 5;
		String s = "Hei";
		double b = 4.2; // Manglet typedeklerasjon

		System.out.println(a);
		System.out.println(s);
		System.out.println(b);
		System.out.println(s + a + 3);
		System.out.println(3 + a + s);
//  System.out.println(s - "H");    No work
		System.out.println(7 / a); // Work but feil svar
		System.out.println(13 - 2 * 5);

		@SuppressWarnings("unused")
		int c = 1578;
		// System.out.println(c.length()); No can do
		System.out.println(s.length());

	}
}