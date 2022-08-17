import java.util.ArrayList;

public class arrylist {

	public static void main(String[] args) {
		
		ArrayList<String> rappers = new ArrayList<String>();
		
		rappers.add("Velet");
		rappers.add("Ceza");
		rappers.add("Massaka");
		rappers.add("Contra");

		System.out.println("Rapçi Listesi");
		for(int i=0 ; i<rappers.size() ; i++) {
		System.out.println("* " + rappers.get(i));
		}
		
		System.out.println("\n\n'Contra' Elemanının Indeksi: " + rappers.indexOf("Contra"));	

		
		rappers.remove("Massaka"); //Silmek için
		
		System.out.println("\nYeni Rapçi Listesi");
		for(int i=0 ; i<rappers.size() ; i++) {
		System.out.println("* " + rappers.get(i));
		}
		
		System.out.println("\n\n'Contra' Elemanının Indeksi: " + rappers.indexOf("Contra"));	

		
		rappers.remove(0); //Silmek için
		
		System.out.println("\nYeni Rapçi Listesi");
		for(int i=0 ; i<rappers.size() ; i++) {
		System.out.println("* " + rappers.get(i));
		}
		
		// ARRAYLIST İÇİNDEKİ ELEMANIN KAÇINCI INDEKSTE OLDUĞUNU ÖĞRENMEK İÇİN
		System.out.println("\n\n'Contra' Elemanının Indeksi: " + rappers.indexOf("Contra"));	
		}
	}