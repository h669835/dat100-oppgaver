package dat100.hvl.uke40;

public class G1Kvadrat {
	int sidelengde;

	public G1Kvadrat(int sidelengde) {
		this.sidelengde = sidelengde;
	}

	public int areal() {
		return this.sidelengde * this.sidelengde;
	}

	public int omkrets() {
		return 4 * this.sidelengde;
	}

	public float diagonal() {
		return (float) Math.sqrt((Math.pow(this.sidelengde, 2)) + (Math.pow(this.sidelengde, 2)));
	}

	public void tegn() {
		for (int i = 0; i < this.sidelengde; i++) {
			for (int j = 0; j < this.sidelengde; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public boolean sum(G1Kvadrat kv1, G1Kvadrat kv2) {
		if (this.areal() == kv1.areal() + kv2.areal()) {
			return true;
		}
		return false;
	}
}
