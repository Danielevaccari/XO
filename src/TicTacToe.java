
public class TicTacToe {

	public static void main(String[] args) {

		System.out.println("TICTACTOE");
		System.out.println();
		System.out.println("- Yksinpeli vai kaksinpeli ? -");
		System.out.println("- Syötä numero 1 yksinpelille -");
		System.out.println("- Syötä numero 2 kaksinpelille -");

		ristikko lauta = new ristikko();
		//vääräsyöte -> kaksinpeli korjaa laittamalla rajotukset inputille

		if (lauta.palautaYksinVaiKaksinpeli() == 1) {
			
			lauta.asetaPelaajanNimi();
			lauta.tulostaEsimerkkiPeliLauta();

			while (lauta.annaJatketaankoPelia()) {
				// Pelaajan vuoro
				lauta.sijoitaX();
				lauta.tulostaPeliLauta();
				lauta.tarkistaOnkoXVoittanut();
				if (!lauta.annaJatketaankoPelia()) {
					System.out.println(lauta.getPelaaja1() + " voitti pelin !");
					break;
				}
				lauta.tarkistaOnkoTasapeli();
				if (lauta.getOnkoTasapeli()) {
					break;
				}
				// Tietokoneen vuoro
				lauta.asetaTietokonepelaajanNappula();
				lauta.tulostaPeliLauta();
				lauta.tarkistaOnkoOVoittanut();
				if (!lauta.annaJatketaankoPelia()) {
					System.out.println("CPU voitti pelin !");
					break;
				}
				lauta.tarkistaOnkoTasapeli();
				if (lauta.getOnkoTasapeli()) {
					break;
				}

			}
		} else {

			lauta.asetaPelaajienNimet();
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
					break;
				}

			}
		}
	}
}
