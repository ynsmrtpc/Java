
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
		** Bu þekilde yapacaðýmýza aþaðýdaki gibi de yazabiliriz, daha kýsa bir þekilde! */
		this("Bilgi Yok!", "Bilgi Yok!", 0, 0);
	}
	

	public car(String color, String model, double engine, int doors) {
		this.color  = color;
		this.model  = model;
		this.engine = engine;
		this.doors  = doors;				
	}
	
	public void showInfo() {
		System.out.println("Arabanýn rengi: " + this.color);
		System.out.println("Arabanýn modeli: " + this.model);
		System.out.println("Arabanýn motor gücü: " + this.engine);	
		System.out.println("Arabanýn kapý sayýsý: " + this.doors);
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
			System.out.println("Kapý sayýsý sadece 2 veya 4 olabilir!");
	}
	
	public void start() {
		System.out.println("Car is started...");
	}
	
	public void stop() {
		System.out.println("Car is stopped...");
	}
	*/



