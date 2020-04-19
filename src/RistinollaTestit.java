import org.junit.Test;

class RistinollaTestit {

	ristikko testilauta = new ristikko();
	
	public void asettaakoSijoitusmetodiXpelinappulanOikeaanKohtaan() {
		
	}
	@Test
	public void antaakoSatunnaisenIndeksinVäliltäYksViivaYhdeksän(){
		assert testilauta.annaSatunnainenPelilaudanIndeksi() >= 1 && testilauta.annaSatunnainenPelilaudanIndeksi() <= 9;
	}

}
