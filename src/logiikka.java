import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class logiikka extends pelaaja {

	private boolean jatketaankoPelia = true;
	private boolean onkoTasapeli = false;
	protected ArrayList<Integer> varatutRuudut = new ArrayList<>();

	public boolean getOnkoTasapeli() {
		return onkoTasapeli;
	}

	public void setOnkoTasapeli(boolean onkoTasapeli) {
		this.onkoTasapeli = onkoTasapeli;
	}

	public boolean annaJatketaankoPelia() {
		return jatketaankoPelia;
	}

	public void asetaJatketaankoPelia(boolean b) {
		jatketaankoPelia = b;
	}

	/**
	 * Tarkistaa onko tasapeli ja tulostaa "tasapeli !"
	 */
	public void tarkistaOnkoTasapeli() {
		// Tarkastetaan heti aluksi onko pelilaudalla tilaa
		// Jos ei ole peli lopetetaan ja ilmoitetaan tasapelistä
		if (varatutRuudut.size() == 9) {
			setOnkoTasapeli(true);
			System.out.println("Tasapeli!");
		}
	}

	/**
	 * Tarkistaa onko X merkillä pelaava pelaaja voittanut pelin
	 */
	public void tarkistaOnkoXVoittanut() {
		// vasen vertikaali
		if (ristikko.peliLauta[1][1] == 'X' && ristikko.peliLauta[3][1] == 'X' && ristikko.peliLauta[5][1] == 'X') {
			jatketaankoPelia = false;
		}
		// keski vertikaali
		else if (ristikko.peliLauta[1][3] == 'X' && ristikko.peliLauta[3][3] == 'X'
				&& ristikko.peliLauta[5][3] == 'X') {
			jatketaankoPelia = false;
		}
		// oikea vertikaali
		else if (ristikko.peliLauta[1][5] == 'X' && ristikko.peliLauta[3][5] == 'X'
				&& ristikko.peliLauta[5][5] == 'X') {
			jatketaankoPelia = false;
		}
		// ylä horizontaalinen
		else if (ristikko.peliLauta[1][1] == 'X' && ristikko.peliLauta[1][3] == 'X'
				&& ristikko.peliLauta[1][5] == 'X') {
			jatketaankoPelia = false;
		}
		// keski horizontaalinen
		else if (ristikko.peliLauta[3][1] == 'X' && ristikko.peliLauta[3][3] == 'X'
				&& ristikko.peliLauta[3][5] == 'X') {
			jatketaankoPelia = false;
		}
		// ala horizontaalinen
		else if (ristikko.peliLauta[5][1] == 'X' && ristikko.peliLauta[5][3] == 'X'
				&& ristikko.peliLauta[5][5] == 'X') {
			jatketaankoPelia = false;
		}
		// vasen yläkulma - oikea alakulma diagonaali
		else if (ristikko.peliLauta[1][1] == 'X' && ristikko.peliLauta[3][3] == 'X'
				&& ristikko.peliLauta[5][5] == 'X') {
			jatketaankoPelia = false;
		}
		// vasen alakulma - oikea yläkulma diagonaali
		else if (ristikko.peliLauta[5][1] == 'X' && ristikko.peliLauta[3][3] == 'X'
				&& ristikko.peliLauta[1][5] == 'X') {
			jatketaankoPelia = false;
		}
	}

	/**
	 * Tarkistaa onko O merkillä pelaava pelaaja voittanut pelin
	 */
	public void tarkistaOnkoOVoittanut() {
		// vasen vertikaali
		if (ristikko.peliLauta[1][1] == 'O' && ristikko.peliLauta[3][1] == 'O' && ristikko.peliLauta[5][1] == 'O') {
			jatketaankoPelia = false;
		}
		// keski vertikaali
		else if (ristikko.peliLauta[1][3] == 'O' && ristikko.peliLauta[3][3] == 'O'
				&& ristikko.peliLauta[5][3] == 'O') {
			jatketaankoPelia = false;
		}
		// oikea vertikaali
		else if (ristikko.peliLauta[1][5] == 'O' && ristikko.peliLauta[3][5] == 'O'
				&& ristikko.peliLauta[5][5] == 'O') {
			jatketaankoPelia = false;
		}
		// ylä horizontaalinen
		else if (ristikko.peliLauta[1][1] == 'O' && ristikko.peliLauta[1][3] == 'O'
				&& ristikko.peliLauta[1][5] == 'O') {
			jatketaankoPelia = false;
		}
		// keski horizontaalinen
		else if (ristikko.peliLauta[3][1] == 'O' && ristikko.peliLauta[3][3] == 'O'
				&& ristikko.peliLauta[3][5] == 'O') {
			jatketaankoPelia = false;
		}
		// ala horizontaalinen
		else if (ristikko.peliLauta[5][1] == 'O' && ristikko.peliLauta[5][3] == 'O'
				&& ristikko.peliLauta[5][5] == 'O') {
			jatketaankoPelia = false;
		}
		// vasen yläkulma - oikea alakulma diagonaali
		else if (ristikko.peliLauta[1][1] == 'O' && ristikko.peliLauta[3][3] == 'O'
				&& ristikko.peliLauta[5][5] == 'O') {
			jatketaankoPelia = false;
		}
		// vasen alakulma - oikea yläkulma diagonaali
		else if (ristikko.peliLauta[5][1] == 'O' && ristikko.peliLauta[3][3] == 'O'
				&& ristikko.peliLauta[1][5] == 'O') {
			jatketaankoPelia = false;
		}
	}

	/**
	 * Palauttaa Satunnaisen kokonaisluvun väliltä [1-9]
	 * 
	 * @return
	 */
	public int annaSatunnainenPelilaudanIndeksi() {

		Random r = new Random();

		int num = r.nextInt(10);
		return num;
	}

	public int palautaYksinVaiKaksinpeli() {
		Scanner scanner = new Scanner(System.in);
		int yksTaiKaks = 0;
		try {
			yksTaiKaks = scanner.nextInt();
			if (yksTaiKaks != 1 && yksTaiKaks != 2) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("- Syötä kokonaisluku 1 tai 2 -");
			palautaYksinVaiKaksinpeli();
		}
		return yksTaiKaks;
	}
}
