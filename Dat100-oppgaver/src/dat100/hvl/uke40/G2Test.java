package dat100.hvl.uke40;

public class G2Test {

	public static void main(String[] args) {
		G2Konto k1 = new G2Konto(234512);
		G2Konto k2 = new G2Konto(123462);
		G2Konto k3 = new G2Konto(134565);

		info(k1);
		info(k2);
		info(k3);

		k1.innskudd(100);
		k2.uttak(1000);
		k3.innskudd(-50);

		System.out.println();
		System.out.println("Samlet saldo: " + (k1.saldo + k2.saldo + k3.saldo));
	}

	public static void info(G2Konto k) {
		k.saldo();
	}

}
