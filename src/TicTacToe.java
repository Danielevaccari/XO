public class TicTacToe {

	public static void main(String[] args) {
		ristikko lauta = new ristikko();

		while (lauta.annaJatketaankoPelia()) {
			lauta.sijoitaX();
			lauta.tarkistaOnkoXVoittanut();
			lauta.tulostaPeliLauta();
			lauta.sijoitaO();
			lauta.tarkistaOnkoOVoittanut();
			lauta.tulostaPeliLauta();
		}
	}
}
