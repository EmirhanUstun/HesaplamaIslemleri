package tr.edu.medipol.yova;

public class Hesaplama {

	public static void main(String[] args) {
		Hesaplama h = new Hesaplama();
		long toplamaSonucu = h.toplama(42, 28);
		System.out.println(toplamaSonucu);
	}
	
	long toplama(int sayi1 , int sayi2) {
		long sonuc = (long)sayi1 + sayi2;
		return sonuc;
	}
		
	
}
