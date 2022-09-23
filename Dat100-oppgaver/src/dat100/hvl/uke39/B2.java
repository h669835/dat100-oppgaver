package dat100.hvl.uke39;

import easygraphics.EasyGraphics;

@SuppressWarnings("serial")
public class B2 extends EasyGraphics {

	// nesten dekket hvis mindre en fra havoverflaten
	int NESTEN_DEKKET = 1;

	int RADIUS = 40; // radius for cirkler som skal tegnes
	int MARGIN = 50; // venstre/høyre margin i tegneområdet

	int WINDOWWIDTH = 800;
	int WINDOWHEIGHT = 300;

	// terreng hogde
	static int[][] terreng = { { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 }, { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
			{ 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 } };

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {

		makeWindow("FLOODING", WINDOWWIDTH, WINDOWHEIGHT);

		visualiser();
	}

	public static int[] getColor(int posY, int posX, int havHøyde) {
		int[] color = new int[3];
		int terreng_høyde = terreng[posY][posX];
		if (terreng_høyde - havHøyde <= 0) {
			color[0] = 0;
			color[1] = 0;
			color[2] = 255;
		} else if (terreng_høyde - havHøyde <= 1) {
			color[0] = 222;
			color[1] = 184;
			color[2] = 135;
		} else if (terreng_høyde - havHøyde > 1) {
			color[0] = 255;
			color[1] = 140;
			color[2] = 0;
		}

		return color;
	}

	public void visualiser() {

		System.out.println("Angi havhøyde i tegnevinduet ...");
		int hav = Integer.parseInt(getText("havhøyde"));
		int bredde_sirkel = (WINDOWWIDTH / terreng[0].length);
		int høyde_sirkel = (WINDOWHEIGHT / terreng.length);

		while (hav >= 0) {

			for (int i = 0; i < terreng.length; i++) {
				for (int j = 0; j < terreng[i].length; j++) {
					int[] color = getColor(i, j, hav);
					setColor(color[0], color[1], color[2]);
					fillCircle(j * (bredde_sirkel) + (bredde_sirkel / 2), i * (høyde_sirkel) + (høyde_sirkel / 2),
							RADIUS);
				}
			}

			// TODO - START

			setColor(0, 0, 255); // blå - vann

			setColor(222, 184, 135); // lysebrun - tørt

			setColor(255, 140, 0); // oransje - søle

			// TODO - SLUTT

			System.out.println("Angi havhøyde i tegnevinduet ...");
			hav = Integer.parseInt(getText("havhøyde"));
		}
	}
}