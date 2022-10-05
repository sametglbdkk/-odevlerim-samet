package array;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Ali";
		String ogrenci2="Pakize";
		String ogrenci3="Samet";
		String ogrenci4="Said";
		
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("ilk aşama bitti");
		System.out.println("                ");
		
		String[] ogrenciler = new String[3];
		ogrenciler[0]="Ali";
		ogrenciler[1]="Pakize";
		ogrenciler[2]="Samet";
		
		
	for (int i = 0; i < ogrenciler.length; i++) {
		System.out.println(ogrenciler[i]);
		System.out.println("ikinci aşama da bitti :)");
		
	}
	for (String ogrenci : ogrenciler) {
		System.out.println(ogrenci);
		
	}

	}

}
