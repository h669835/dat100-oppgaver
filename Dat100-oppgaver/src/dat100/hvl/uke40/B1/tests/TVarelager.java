package dat100.hvl.uke40.B1.tests;

import dat100.hvl.uke40.B1.Vare;
import dat100.hvl.uke40.B1.Varelager;

public class TVarelager extends Varelager {

	public TVarelager(int n) {
		super(n);
	}

	public int getAntall() {
		return this.antall;
	}

	public Vare[] getTVarer() {
		return this.varer;
	}
}