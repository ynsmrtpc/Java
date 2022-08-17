/*
 * Ýki Tam Sayýnýn Toplamý Programý
 */

package OrtaOrnekler;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exp1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("1.Addition\n2.Extraction\n3.Multiplication\n4.Division\n5.Find Remainder\n6.All of Them");
		System.out.print("Please choose one operation:");
		int choose = scan.nextInt();
		System.out.print("OK. Now, please enter two number:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		scan.useLocale(Locale.US);
		DecimalFormat formatter = new DecimalFormat("###.##"); // VÝRGÜLDEN SONRA 2 BASAMAK YAZMAYA YARAR
		
		int totaladd = x + y;
		int totalex = x - y;
		int totalmulti = x * y;
		double totaldiv = (double)x / y;
		int totalrem = x % y;
	
		if(choose == 1)
			System.out.println("Addition:" + totaladd);
		else if(choose == 2)
			System.out.println("Extraction:" + totalex);
		else if(choose == 3)
			System.out.println("Multiplication:" + totalmulti);
		else if(choose == 4)
			System.out.println("Division:"+ formatter.format(totaldiv));
		else if(choose == 5)
			System.out.println("Remaining" + totalrem);
		else if (choose == 6)
			System.out.println("Addition:" + totaladd + " / Extraction:" + totalex + " / Multiplication:" + totalmulti + " / Division:"+ formatter.format(totaldiv) + " / Remaining:" + totalrem);
		else
			System.out.println("Invalid Transaction");
	}
}
