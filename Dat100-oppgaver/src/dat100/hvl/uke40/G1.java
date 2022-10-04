package dat100.hvl.uke40;

public class G1 {

	public static void main(String[] args) {
		G1Kvadrat kv3 = new G1Kvadrat(3);
		G1Kvadrat kv4 = new G1Kvadrat(4);
		G1Kvadrat kv5 = new G1Kvadrat(5);
		System.out.println("Kan skrives som sum av KV4 og KV4?: " + kv3.sum(kv5, kv4));
		info(kv3);
		System.out.println("Kan skrives som sum av KV3 og KV5?: " + kv4.sum(kv3, kv5));
		info(kv4);
		System.out.println("Kan skrives som sum av KV3 og KV4?: " + kv5.sum(kv3, kv4));
		info(kv5);
	}

	public static void info(G1Kvadrat kv) {
		kv.tegn();
		int sidelengde = kv.sidelengde;
		int areal = kv.areal();
		int omkrets = kv.omkrets();
		float diagonal = kv.diagonal();
		System.out.println("Sidelengde: " + sidelengde);
		System.out.println("Areal: " + areal);
		System.out.println("Omkrets: " + omkrets);
		System.out.println("Diagonal: " + diagonal);
		System.out.println();
	}

}
