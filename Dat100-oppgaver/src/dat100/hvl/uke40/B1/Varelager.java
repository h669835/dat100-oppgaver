package dat100.hvl.uke40.B1;

public class Varelager {

	protected Vare[] varer;
	protected int antall;

	public Varelager(int n) {

		this.varer = new Vare[n];
		this.antall = 0;

	}

	public Vare[] getVarer() {

		return this.varer;

	}

	public boolean leggTilVare(Vare v) {

		if (antall < this.varer.length) {
			this.varer[antall] = v;
			antall++;
			return true;
		}
		return false;

	}

	public boolean leggTil(int varenr, String navn, double pris) {

		Vare nv = new Vare(varenr, navn, pris);
		if (leggTilVare(nv)) {
			return true;
		}
		return false;
	}

	public Vare finnVare(int varenr) {

		for (Vare vare : varer) {
			if (vare.varenr == varenr) {
				return vare;
			}
		}
		return null;

	}

	private String SEP = "==============================";

	public void printVarelager() {

		System.out.println(SEP);
		for (Vare vare : varer) {
			System.out.println(vare.toString());
		}
		System.out.println(SEP);

	}

}
