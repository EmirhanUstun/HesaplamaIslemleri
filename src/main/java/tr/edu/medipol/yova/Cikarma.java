package tr.edu.medipol.yova;

public class Cikarma {

	public static void main(String[] args) {

		Cikarma c = new Cikarma();
		int s = c.cikarma(65, 28);
		System.out.println(s);
	}
	
	int cikarma(int sayi1, int sayi2) {
		int sonuc = sayi1 -sayi2;
		return sonuc;
	}

}
