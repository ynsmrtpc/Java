
public class Referanslar {

	public static void main(String[] args) {
/*		car car1 = new car("G�m��", "Renault Megane", 1.6, 4);
		car car2 = car1;
		
		car1.showInfo();
		car2.showInfo();
		
		car car3 = null;		
		car3.showInfo();
*/
		
		String s1 = new String("Yunus");
		String s2 = new String("Yunus");
		
		if(s1 == s2) {
			System.out.println("E�it");
		}
		
		else
			System.out.println("E�it De�il!");
		
		if(s1.equals(s2)) {
			System.out.println("E�it");
		}
		
		else
			System.out.println("E�it De�il!");

	}
}
