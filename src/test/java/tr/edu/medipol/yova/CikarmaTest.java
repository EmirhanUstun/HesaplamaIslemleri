package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class CikarmaTest {

	@Test
	public void testCikarma() {
		
		int sayi1 = 65;
		int sayi2 = 28;
		Cikarma c = new Cikarma();
		
		
		int gerceklesen = c.cikarma(sayi1, sayi2);
		
		
		assertEquals(37, gerceklesen);
		
	}

}
