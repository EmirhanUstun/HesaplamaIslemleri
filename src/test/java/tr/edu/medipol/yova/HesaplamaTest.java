package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testToplama() {
		// GIVEN (Asagidaki kosullar altinda)
		int sayi1 = 42;
		int sayi2 = 28;
		Hesaplama h = new Hesaplama();
		
		// WHEN (Asagidaki fonksiyon cagirildiginda)
		long gerceklesen = h.toplama(sayi1, sayi2);
		
		// THEN (Asagidaki sonuclarin olusmasini beklerim)
		assertEquals(70, gerceklesen);
		
	}
	
	@Test
	public void testToplamaCokBuyukSayilar() {
		// GIVEN (Asagidaki kosullar altinda)
		int sayi1 = 1;
		int sayi2 = Integer.MAX_VALUE;
		Hesaplama h = new Hesaplama();
		
		// WHEN (Asagidaki fonksiyon cagirildiginda)
		long gerceklesen = h.toplama(sayi1, sayi2);
		
		// THEN (Asagidaki sonuclarin olusmasini beklerim)
		assertEquals(28736478L, gerceklesen);
	}
	
	@Test
	public void testToplamaCokBuyukSayilar2() {
		// GIVEN (Asagidaki kosullar altinda)
		int sayi1 = Integer.MAX_VALUE;
		int sayi2 = Integer.MAX_VALUE;
		Hesaplama h = new Hesaplama();
		
		// WHEN (Asagidaki fonksiyon cagirildiginda)
		long gerceklesen = h.toplama(sayi1, sayi2);
		
		// THEN (Asagidaki sonuclarin olusmasini beklerim)
		assertEquals(429497686L, gerceklesen);
	}
}
