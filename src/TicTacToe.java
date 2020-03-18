import java.util.Scanner;

public class TicTacToe {
	static String pelaaja1;
	static String pelaaja2;
	public static void main(String[] args) {
		ristikko lauta = new ristikko();
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Anna pelaajan nimi, joka pelaa X nappuloilla");
		pelaaja1 = scanner.next();
		System.out.println("Anna Pelaajan nimi, joka pelaa O nappuloilla");
		pelaaja2 = scanner.next();
		lauta.tulostaEsimerkkiPeliLauta();
		
		while (lauta.annaJatketaankoPelia()) {
			lauta.sijoitaX();
			lauta.tarkistaOnkoXVoittanut();
			lauta.tulostaPeliLauta();
			if (!lauta.annaJatketaankoPelia()) {
				System.out.println(pelaaja1 + " voitti pelin!");
				break;
			}
			lauta.sijoitaO();
			lauta.tarkistaOnkoOVoittanut();
			lauta.tulostaPeliLauta();
			if (!lauta.annaJatketaankoPelia()) {
				System.out.println(pelaaja1 + " voitti pelin!");
				break;
			}
		}
	}
}
