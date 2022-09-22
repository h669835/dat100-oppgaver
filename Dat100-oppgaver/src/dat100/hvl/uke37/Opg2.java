package dat100.hvl.uke37;

public class Opg2 {

	public static void a(String[] args) {

		int i = 5;
		int j = 10;
		String s = "dat100";
		boolean b = true;

		System.out.println(i * j + i); // 55
		System.out.println(b && i > 5); // False
		System.out.println(!b || j == 10); // True
		System.out.println(s.substring(3, 5)); // 10
	}

	public static void b(String[] args) {

		System.out.println(5 + 3 * 2); // 11
		System.out.println(9 % 5); // 4
		System.out.println(9 / 5); // 1
		int i = 3;
		int j = 7;

		System.out.println((i < 3) && (j >= 5)); // False
		System.out.println((j != 3) || (i < j)); // True
	}

	public static int c(int x, int y) {

		while (x != y) {
			System.out.println("x = " + x + ", y = " + y);
			if (x > y) {
				x = x - y;
			} else {
				y = y - x;
			}
		}

		return x;
	}

	public static void main(String[] args) {
		a(null);
		b(null);
		System.out.println(c(28, 12)); // 4
	}

}
