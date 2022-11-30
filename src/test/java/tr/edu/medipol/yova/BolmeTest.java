package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class BolmeTest {

	@Test
	public void testBolme() {
		
		int sayi1 = 50;
		int sayi2 = 5;
		Bolme b = new Bolme();
		
		int gerceklesen = b.bolme(sayi1, sayi2);
		
		assertEquals(10, gerceklesen);
	}

}
