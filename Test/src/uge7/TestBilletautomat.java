package uge7;

import static org.junit.Assert.*;

import org.junit.Test;

import automat.Billetautomat;

public class TestBilletautomat {

	@Test
	public void testIndsætNegativeBeloeb() {
		Billetautomat automat = new Billetautomat();
		automat.setBilletpris(-10);
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
	public void testNegativeBeloeb() {
		Billetautomat automat = new Billetautomat();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNegativeBeloeb() {
		Billetautomat automat = new Billetautomat();
		
		assertEquals(expected, actual);
	}
}
