/*
 *  Kullanýcý Tarafýndan Girilen Sayýnýn Basamaklarý Toplamýný Bulan Java Programý
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
			total = (num%10) + total; // birler basamaðýný hafýzaya alarak baþlýyoruz
			num = num / 10;		// her seferinde sayýyý soldan 1 basamak azaltýyoruz
		}
		System.out.println("The sum of the digits of the number you entered: " + total);
	}
}
