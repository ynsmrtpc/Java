
public class JavaControl {

	public static void main(String[] args) {
		
		car car1 = new car("G�m��", "Renault Megane", 1.6, 4);
		car car2 = new car();
		car car3 = new car("Siyah", "Mercedes");
		
		car1.showInfo();
		car2.showInfo();
		car3.showInfo();
		/*
		car1.setColor("G�m��");
		car1.setModel("Renault Megane");
		car1.setEngine(1.6);
		car1.setDoors(4);
		System.out.println("Araban�n rengi: " + car1.getColor());
		System.out.println("Araban�n modeli: " + car1.getModel());
		System.out.println("Araban�n motor g�c�: " + car1.getEngine());	
		System.out.println("Araban�n kap� say�s�: " + car1.getDoors());
	
		car1.start();
		car1.stop();
		*/
	}
}


