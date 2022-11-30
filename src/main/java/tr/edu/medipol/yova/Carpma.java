package tr.edu.medipol.yova;

public class Carpma {

	public static void main(String[] args) {
		
		Carpma c = new Carpma();
		int s = c.carpma(3, 6);
		System.out.println(s);
		

	}
	
	int carpma(int sayi1, int sayi2) {
		int sonuc = sayi1 * sayi2;
		return sonuc;
	}

}
