import org.junit.jupiter.api.Test;

class RistinollaTestit {

	ristikko testilauta = new ristikko();
	
	@Test
	public void antaakoSatunnaisenIndeksinVäliltäYksViivaYhdeksän(){
		assert testilauta.annaSatunnainenPelilaudanIndeksi() >= 1 && testilauta.annaSatunnainenPelilaudanIndeksi() <= 9;
	}

}
