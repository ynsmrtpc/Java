/*
 *  Kullan�c� Taraf�ndan Girilen Say�n�n Basamaklar� Toplam�n� Bulan Java Program�
 * */
package KolayOrnekler;

import java.util.Scanner;

public class Exp4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please, enter a number:");
		int num = scan.nextInt();
		
		int total = 0;
		
		while(num != 0) {
			total = (num%10) + total; // birler basama��n� haf�zaya alarak ba�l�yoruz
			num = num / 10;		// her seferinde say�y� soldan 1 basamak azalt�yoruz
		}
		System.out.println("The sum of the digits of the number you entered: " + total);
	}
}
