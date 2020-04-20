package ristinollaTesti;

import org.junit.jupiter.api.*;


import java.util.stream.*;

import org.junit.jupiter.api.Test;

import ristinolla.ristikko;

class RistinollaTestit {

	ristikko testilauta = new ristikko();
	
	@Test
	public void antaakoSatunnaisenIndeksinVäliltäYksViivaYhdeksän(){
		assert testilauta.annaSatunnainenPelilaudanIndeksi() >= 1 && testilauta.annaSatunnainenPelilaudanIndeksi() <= 9;
	}

}
