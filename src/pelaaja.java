import java.util.Scanner;

public class pelaaja {

	protected String pelaaja1;
	protected String pelaaja2;

	public String getPelaaja1() {
		return pelaaja1;
	}
	public void setPelaaja1(String pelaaja1) {
		this.pelaaja1 = pelaaja1;
	}
	public String getPelaaja2() {
		return pelaaja2;
	}

	public void setPelaaja2(String pelaaja2) {
		this.pelaaja2 = pelaaja2;
	}

	public void asetaPelaajienNimet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("- Syötä pelaajan nimi, joka pelaa X nappuloilla -");
		setPelaaja1(sc.next());
		System.out.println("- Syötä pelaajan nimi, joka pelaa O nappuloilla -");
		setPelaaja2(sc.next());
	}

	/**
	 * Asettaa yksinpelin pelaajan nimen muuttujaan pelaaja1
	 */
	public void asetaPelaajanNimi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("- Syötä pelaajan nimi -");
		setPelaaja1(scanner.next());
	}
}
