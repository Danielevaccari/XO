import java.util.InputMismatchException;
import java.util.Scanner;

public class ristikko extends logiikka {

	/**
	 * Luo uuden ristinollapelin ja asettaa pelaajien nimet
	 */
	public ristikko() {
		Scanner sc = new Scanner(System.in);
		System.out.println("- Syötä pelaajan nimi, joka pelaa X nappuloilla -");
		setPelaaja1(sc.next());
		System.out.println("- Syötä pelaajan nimi, joka pelaa O nappuloilla -");
		setPelaaja2(sc.next());
	}

	// Ristinollan pelilauta char-taulukkona
	public static char[][] peliLauta = { { ' ', '-', '-', '-', '-', '-', ' ' }, { '|', ' ', '|', ' ', '|', ' ', '|' },
			{ '|', '-', '+', '-', '+', '-', '|' }, { '|', ' ', '|', ' ', '|', ' ', '|' },
			{ '|', '-', '+', ' ', '+', '-', '|' }, { '|', ' ', '|', ' ', '|', ' ', '|' },
			{ ' ', '-', '-', '-', '-', '-', ' ' } };

	// Ristinollan esimerkkipelilauta, jossa näkyy indeksit
	public static char[][] esimerkkiPeliLauta = { { ' ', '-', '-', '-', '-', '-', ' ' },
			{ '|', '1', '|', '2', '|', '3', '|' }, { '|', '-', '+', '-', '+', '-', '|' },
			{ '|', '4', '|', '5', '|', '6', '|' }, { '|', '-', '+', '-', '+', '-', '|' },
			{ '|', '7', '|', '8', '|', '9', '|' }, { ' ', '-', '-', '-', '-', '-', ' ' } };

	/**
	 * Tulostaa pelilaudan sen hetkisessä tilassaan
	 */
	public void tulostaPeliLauta() {
		// Käydään läpi jokainen indeksi ja printataan se
		for (int i = 0; i < peliLauta.length; i++) {
			for (int k = 0; k < peliLauta.length; k++) {
				System.out.print(peliLauta[i][k]);
			}
			System.out.println();
		}
	}

	public void tulostaEsimerkkiPeliLauta() {
		// Käydään läpi jokainen indeksi ja printataan se
		System.out.println("- Nappuiloiden indeksit ovat seuraavanlaiset -");
		for (int i = 0; i < esimerkkiPeliLauta.length; i++) {
			for (int k = 0; k < esimerkkiPeliLauta.length; k++) {
				System.out.print(esimerkkiPeliLauta[i][k]);
			}
			System.out.println();
		}
	}

	/**
	 * sijoittaa O:n haluttuun indeksiin käsittelee virheilmoitukset Lisää indeksin
	 * varattujen ruutujen listaan (vain jos indeksi on välillä [1-9]) käsittelee
	 * varatut ruudut
	 **/
	public void sijoitaX() {
		// Kysytään mihin kohtaan halutaan sijoittaa X
		// Indeksointi toimii vasemmalta oikealle ja ylhäältä alas
		Scanner scanner = new Scanner(System.in);
		System.out.println("- Syötä kokonaisluku mihin haluat sijoittaa X:n -");

		int index = 0;

		try {

			index = scanner.nextInt();
			if (index < 1 || index > 9) {
				throw new InputMismatchException();
			}
		} catch (InputMismatchException e) {
			System.out.println("- Ole hyvä ja syötä kokonaisluku väliltä [1-9] -");
			sijoitaX();
		}

		// Indeksinä toimii kokonaisluvut
		if (!varatutRuudut.contains(index)) {
			switch (index) {
			case 1:
				peliLauta[1][1] = 'X';
				break;
			case 2:
				peliLauta[1][3] = 'X';
				break;
			case 3:
				peliLauta[1][5] = 'X';
				break;
			case 4:
				peliLauta[3][1] = 'X';
				break;
			case 5:
				peliLauta[3][3] = 'X';
				break;
			case 6:
				peliLauta[3][5] = 'X';
				break;
			case 7:
				peliLauta[5][1] = 'X';
				break;
			case 8:
				peliLauta[5][3] = 'X';
				break;
			case 9:
				peliLauta[5][5] = 'X';
				break;
			}
			// lopuksi lisätään indeksi varattuihin ruutuihin
			if (index < 10 && index > 0) {
				varatutRuudut.add(index);
			}
		} else {
			System.out.println("- Ruutu on varattu! -");
			sijoitaX();
		}
	}

	/**
	 * sijoittaa O:n haluttuun indeksiin käsittelee virheilmoitukset Lisää indeksin
	 * varattujen ruutujen listaan (vain jos indeksi on välillä [1-9]) käsittelee
	 * varatut ruudut
	 */
	public void sijoitaO() {
		// Kysytään mihin kohtaan halutaan sijoittaa O
		// Indeksointi toimii vasemmalta oikealle ja ylhäältä alas
		Scanner scanner = new Scanner(System.in);
		System.out.println("- Syötä kokonaisluku mihin haluat sijoittaa O:n -");

		int index = 0;

		try {
			index = scanner.nextInt();
			if (index < 1 || index > 9) {
				throw new InputMismatchException();
			}
		} catch (InputMismatchException e) {
			System.out.println("- Ole hyvä ja syötä kokonaisluku väliltä [1-9] -");
			sijoitaO();
		}

		// Indeksinä toimii kokonaisluvut
		if (!varatutRuudut.contains(index)) {
			switch (index) {
			case 1:
				peliLauta[1][1] = 'O';
				break;
			case 2:
				peliLauta[1][3] = 'O';
				break;
			case 3:
				peliLauta[1][5] = 'O';
				break;
			case 4:
				peliLauta[3][1] = 'O';
				break;
			case 5:
				peliLauta[3][3] = 'O';
				break;
			case 6:
				peliLauta[3][5] = 'O';
				break;
			case 7:
				peliLauta[5][1] = 'O';
				break;
			case 8:
				peliLauta[5][3] = 'O';
				break;
			case 9:
				peliLauta[5][5] = 'O';
				break;
			}
			// lopuksi lisätään indeksi varattuihin ruutuihin
			if (index < 10 && index > 0) {
				varatutRuudut.add(index);
			}
		} else {
			System.out.println("- Ruutu on varattu! -");
			sijoitaO();
		}
	}
}
