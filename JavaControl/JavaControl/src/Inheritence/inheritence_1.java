package Inheritence;

public class inheritence_1 {

	public static void main(String[] args) {
		
		employee Employee = new employee("Yunus Emre", "Biliþim", 15000);
		manager Manager = new manager("Yunus Emre", "Biliþim", 30000,10);
		
		System.out.print("Çalýþan ");
		Employee.showinfos();
		
		System.out.print("\nYönetici ");
		Manager.showinfos();
		
		Manager.raiseSalary(100);
		
		System.out.println(Manager);
		
		employee employee = new manager("Yunus Emre Topçu", "Biliþim", 15000,10);
		employee.showinfos();
		
		
		
	}
}
