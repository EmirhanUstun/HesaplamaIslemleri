package tr.edu.medipol.yova;

public class Bolme {

	public static void main(String[] args) {

		Bolme b = new Bolme();
		int s = b.bolme(50, 5);
		System.out.println(s);
		
	}
	
	int bolme (int sayi1, int sayi2) {
		int sonuc = sayi1 / sayi2;
		return sonuc;
	}

}
