package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarpmaTest {

	@Test
	public void testCarpma() {
		
		int sayi1 = 3;
		int sayi2 = 6;
		Carpma c = new Carpma();
		
		int gerceklesen = c.carpma(sayi1, sayi2);
		
		assertEquals(18, gerceklesen);
		
	}

}
