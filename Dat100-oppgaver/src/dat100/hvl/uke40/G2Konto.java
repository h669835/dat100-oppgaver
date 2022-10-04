package dat100.hvl.uke40;

public class G2Konto {
	int kontonummer;
	float saldo = 0;

	public G2Konto(int kontonummer) {
		this.kontonummer = kontonummer;
	}

	public void saldo() {
		System.out.println();
		System.out.println("Info: ");
		System.out.println(this.kontonummer + " => " + this.saldo + "kr");
	}

	public void innskudd(float kr) {
		System.out.println();
		if (kr <= 0) {
			System.out.println("Innskudd må være mer enn 0kr");
			return;
		}
		this.saldo += kr;
		System.out.println("Innskudd: ");
		this.saldo();
	}

	public void uttak(float kr) {
		System.out.println();
		if (kr <= 0) {
			System.out.println("Uttak må være mer enn 0kr");
			return;
		}
		this.saldo -= kr;
		System.out.println("Uttak: ");
		this.saldo();
	}
}
