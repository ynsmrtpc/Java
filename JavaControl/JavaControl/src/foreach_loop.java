import java.util.ArrayList;

public class foreach_loop {

	public static void main(String[] args) {
		
		ArrayList<String> rappers = new ArrayList<String>();

		rappers.add("Velet");
		rappers.add("Ceza");
		rappers.add("Massaka");
		rappers.add("Contra");
		
		System.out.println("ArrayListin Elemanlarý");
		System.out.println("------------------------");
		for(String s:rappers) {
			System.out.println(s);
		}
		
		int[] arr1 = {10,20,30,40,50};
		
		System.out.println("\nDizi[1]'in Elemanlarý");
		System.out.println("------------------------");
		for(int i: arr1) {
			System.out.println(i);
		}		
	}
}
