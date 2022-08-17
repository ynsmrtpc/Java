
public class JavaControl {

	public static void main(String[] args) {
		
		car car1 = new car("Gümüþ", "Renault Megane", 1.6, 4);
		car car2 = new car();
		car car3 = new car("Siyah", "Mercedes");
		
		car1.showInfo();
		car2.showInfo();
		car3.showInfo();
		/*
		car1.setColor("Gümüþ");
		car1.setModel("Renault Megane");
		car1.setEngine(1.6);
		car1.setDoors(4);
		System.out.println("Arabanýn rengi: " + car1.getColor());
		System.out.println("Arabanýn modeli: " + car1.getModel());
		System.out.println("Arabanýn motor gücü: " + car1.getEngine());	
		System.out.println("Arabanýn kapý sayýsý: " + car1.getDoors());
	
		car1.start();
		car1.stop();
		*/
	}
}


