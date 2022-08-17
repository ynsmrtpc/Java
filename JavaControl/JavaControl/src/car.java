
public class car {
	
	private String color; 
	private String model;
	private double engine;
	private int doors;
	
	public car(String color, String model) {
		this(color, model, 0, 0);
	}
	
	public car() {
		/*this.color = "Bilgi yok!";
		this.model = "Bilgi yok!";
		this.engine = 0;
		this.doors = 0;
		** Bu �ekilde yapaca��m�za a�a��daki gibi de yazabiliriz, daha k�sa bir �ekilde! */
		this("Bilgi Yok!", "Bilgi Yok!", 0, 0);
	}
	

	public car(String color, String model, double engine, int doors) {
		this.color  = color;
		this.model  = model;
		this.engine = engine;
		this.doors  = doors;				
	}
	
	public void showInfo() {
		System.out.println("Araban�n rengi: " + this.color);
		System.out.println("Araban�n modeli: " + this.model);
		System.out.println("Araban�n motor g�c�: " + this.engine);	
		System.out.println("Araban�n kap� say�s�: " + this.doors);
	}
}
	
	/*
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		if (doors == 2 || doors == 4){
			this.doors = doors;
		}
		else
			System.out.println("Kap� say�s� sadece 2 veya 4 olabilir!");
	}
	
	public void start() {
		System.out.println("Car is started...");
	}
	
	public void stop() {
		System.out.println("Car is stopped...");
	}
	*/



