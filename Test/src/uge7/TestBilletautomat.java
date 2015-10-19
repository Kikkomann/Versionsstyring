package uge7;

import static org.junit.Assert.*;

import org.junit.Test;

import automat.Billetautomat;

public class TestBilletautomat {

	@Test
	public void testIndsætNegativeBeloeb() {
		Billetautomat automat = new Billetautomat();
		automat.indsætPenge(-10);
		assertEquals(0, automat.getBalance());
	}

	@Test
	public void testKoebUdenPenge() {
		Billetautomat automat = new Billetautomat();
		automat.indsætPenge(8);
		automat.udskrivBillet();
		assertEquals(8, automat.getBalance());
	}
	
	@Test
	public void testSaetNegativPris() {
		Billetautomat automat = new Billetautomat();
		automat.erMontør();
		automat.setBilletpris(-10);
		assertEquals(0, automat.getBalance());
		//Kan ikke logge ind som montør uden at ændre Billetautomat-koden.
	}
	

}
