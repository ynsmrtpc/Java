import java.util.ArrayList;

public class arrylist {

	public static void main(String[] args) {
		
		ArrayList<String> rappers = new ArrayList<String>();
		
		rappers.add("Velet");
		rappers.add("Ceza");
		rappers.add("Massaka");
		rappers.add("Contra");

		System.out.println("Rap�i Listesi");
		for(int i=0 ; i<rappers.size() ; i++) {
		System.out.println("* " + rappers.get(i));
		}
		
		System.out.println("\n\n'Contra' Eleman�n�n Indeksi: " + rappers.indexOf("Contra"));	

		
		rappers.remove("Massaka"); //Silmek i�in
		
		System.out.println("\nYeni Rap�i Listesi");
		for(int i=0 ; i<rappers.size() ; i++) {
		System.out.println("* " + rappers.get(i));
		}
		
		System.out.println("\n\n'Contra' Eleman�n�n Indeksi: " + rappers.indexOf("Contra"));	

		
		rappers.remove(0); //Silmek i�in
		
		System.out.println("\nYeni Rap�i Listesi");
		for(int i=0 ; i<rappers.size() ; i++) {
		System.out.println("* " + rappers.get(i));
		}
		
		// ARRAYLIST ���NDEK� ELEMANIN KA�INCI INDEKSTE OLDU�UNU ��RENMEK ���N
		System.out.println("\n\n'Contra' Eleman�n�n Indeksi: " + rappers.indexOf("Contra"));	
		}
	}