package Inheritence;

public class inheritence_1 {

	public static void main(String[] args) {
		
		employee Employee = new employee("Yunus Emre", "Bili�im", 15000);
		manager Manager = new manager("Yunus Emre", "Bili�im", 30000,10);
		
		System.out.print("�al��an ");
		Employee.showinfos();
		
		System.out.print("\nY�netici ");
		Manager.showinfos();
		
		Manager.raiseSalary(100);
		
		System.out.println(Manager);
		
		employee employee = new manager("Yunus Emre Top�u", "Bili�im", 15000,10);
		employee.showinfos();
		
		
		
	}
}
