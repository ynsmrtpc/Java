import java.util.Scanner;

public class Arrays {
	
	public static void average(int[] arr) {
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		System.out.println("Ortalama: " + (double)total/arr.length);
	}

	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = new int[5];
		
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;
		
		for(int i=0;i<5;i++) {
		System.out.println("Dizi[2]'nin " + (i+1) + ". Elemanı:" + arr2[i]);
		}
		
		System.out.println("****************************");
		
		Scanner scanner = new Scanner(System.in);
		int[] arr3 = new int[5];
		
		for(int i=0;i<arr3.length;i++) {
		System.out.print("Dizi[3]'�n " + (i+1) + ". Elemanını Giriniz:");
		arr3[i] = scanner.nextInt()	;
		}
		for(int i=0;i<arr3.length;i++) {
		System.out.println("Dizi[3]'�n " + (i+1) + ". Eleman�:" + arr3[i]);
		}
		
		average(arr3);
	}
}
