
public class StringS�n�flari {

	public static void main(String[] args) {
		String s1 = "Yunus";
		String s2 = new String("Yunus");
		String s3 = "Yunus";
		
		System.out.println(s2.length());
		System.out.println("0. Indeks: " + s2.charAt(0));
		System.out.println("4. Indeks: " + s2.charAt(4));
		System.out.println("4. Indeks: " + s2.charAt(s2.length()-1));

		System.out.println(s2.startsWith("Yu")); // Yu ile ba�l�yorsa true d�ner
		System.out.println(s2.startsWith("Em")); // Yu ile ba�lamad��� i�in false d�ner
		
		System.out.println(s2.endsWith("us")); // us ile bitti�i i�in true d�ner
		System.out.println(s2.endsWith("re")); // re ile bitmedi�i i�in false d�ner
		
		if(s1 == s3) {
			System.out.println("s1 ve s3 E�it"); // s1 ve s3 bellekte ayn� yeri g�steriyor.
		}
		
		if(s1 == s2) {
			System.out.println("s1 ve s2 E�it");
		}
		else 
			System.out.println("s1 ve s2 E�it De�il");
	
	
		if(s1.equals(s2)) {			// new String ile yapt���m�z i�in bu komutu kullanmam�z gerekiyor.
			System.out.println("s1 ve s2 E�it");
		}
		
	}

}
