package dat100.hvl.uke40.B1;

public class Vare {

	int varenr;
	String navn;
	double pris;

	public Vare(int varenr, String navn, double pris) {

		this.varenr = varenr;
		this.navn = navn;
		this.pris = pris;
	}

	public int getVarenr() {

		return this.varenr;

	}

	public void setVarenr(int varenr) {

		this.varenr = varenr;
	}

	public String getNavn() {

		return this.navn;
	}

	public void setNavn(String navn) {

		this.navn = navn;
	}

	public double getPris() {

		return this.pris;
	}

	public void setPris(double pris) {

		this.pris = pris;
	}

	public double beregnMoms() {

		return this.pris * (0.2);
	}

	public String toString() {

		return "Vare [varenr=" + this.varenr + ", navn=" + this.navn + ", pris=" + this.pris + "]";
	}

	public boolean erBilligereEnn(Vare v) {

		if (this.pris < v.pris) {
			return true;
		}
		return false;
	}

}