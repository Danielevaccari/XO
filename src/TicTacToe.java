
public class TicTacToe {

	public static void main(String[] args) {
		ristikko lauta = new ristikko();

		lauta.tulostaEsimerkkiPeliLauta();

		while (lauta.annaJatketaankoPelia()) {
			// pelaaja1 vuoro
			lauta.sijoitaX();
			lauta.tulostaPeliLauta();
			lauta.tarkistaOnkoXVoittanut();
			if (!lauta.annaJatketaankoPelia()) {
				System.out.println(lauta.getPelaaja1() + " voitti pelin!");
				break;
			}
			lauta.tarkistaOnkoTasapeli();
			if (lauta.getOnkoTasapeli()) {
				System.out.println("Tasapeli!");
				break;
			}
			// pelaaja2 vuoro
			lauta.sijoitaO();
			lauta.tulostaPeliLauta();
			lauta.tarkistaOnkoOVoittanut();
			if (!lauta.annaJatketaankoPelia()) {
				System.out.println(lauta.getPelaaja2() + " voitti pelin!");
				break;
			}
			lauta.tarkistaOnkoTasapeli();
			if (lauta.getOnkoTasapeli()) {
				System.out.println("Tasapeli!");
				break;
			}

		}
	}
}
