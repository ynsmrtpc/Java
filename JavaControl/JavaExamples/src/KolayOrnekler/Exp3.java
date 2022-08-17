/*
 * ARTIK YIL HESAPLAYAN PROGRAM 
 * Genel bir kural olarak, art�k y�llar 4 rakam�n�n kat� olan y�llard�r. Ancak bu kural�n iki istisnas� vard�r:
 * 1. 100'�n kat� olan y�llardan sadece 400'e kalans�z olarak b�l�nebilenler art�k y�ld�r
 * 2. Hesab� daha da hassas h�le getirmek i�in -400'e kalans�z b�l�nebildi�i halde 
 *    -4000'e kalans�z olarak b�l�nebilen y�llar art�k y�l kabul edilmez 
 */
package KolayOrnekler;
import java.util.Scanner;

public class Exp3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean temp;
		
		System.out.print("Please, enter a year:");
		int year = scan.nextInt();
		
		if (year % 4 == 0) {			// 4'�n kat� olan y�llar art�k y�ld�r
			if(year % 100 == 0) {		// 100'�n kat� olanlardan ...
				if (year % 400 == 0) {  // ... 400'e kalans�z b�l�nebilmesi gerekir. Ayr�ca 400'e kalans�z b�l�nebilmesine ra�men
				if (year % 4000 == 0)	// 4000'e de kalans�z b�l�nebilen y�llar
						temp = false;	//  art�k y�l de�ildir.		
					else
						temp = true;	// bu ko�ulu sa�lamayan y�lar art�k y�ld�r.
				}
				else
					temp = false;		
			}
			else 
				temp = true;
		}
		else 
			temp = false;
		
		if(temp)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is a not leap year.");
	}
}
