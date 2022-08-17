
public class StringSýnýflari {

	public static void main(String[] args) {
		String s1 = "Yunus";
		String s2 = new String("Yunus");
		String s3 = "Yunus";
		
		System.out.println(s2.length());
		System.out.println("0. Indeks: " + s2.charAt(0));
		System.out.println("4. Indeks: " + s2.charAt(4));
		System.out.println("4. Indeks: " + s2.charAt(s2.length()-1));

		System.out.println(s2.startsWith("Yu")); // Yu ile baþlýyorsa true döner
		System.out.println(s2.startsWith("Em")); // Yu ile baþlamadýðý için false döner
		
		System.out.println(s2.endsWith("us")); // us ile bittiði için true döner
		System.out.println(s2.endsWith("re")); // re ile bitmediði için false döner
		
		if(s1 == s3) {
			System.out.println("s1 ve s3 Eþit"); // s1 ve s3 bellekte ayný yeri gösteriyor.
		}
		
		if(s1 == s2) {
			System.out.println("s1 ve s2 Eþit");
		}
		else 
			System.out.println("s1 ve s2 Eþit Deðil");
	
	
		if(s1.equals(s2)) {			// new String ile yaptýðýmýz için bu komutu kullanmamýz gerekiyor.
			System.out.println("s1 ve s2 Eþit");
		}
		
	}

}
