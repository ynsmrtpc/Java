package Interface;

public class Main {

	public static void main(String[] args) {
		
//		IDatabase database = new IDatabase(); ** INTERFACELERDEN OBJE OLU�TURULAMAZ !!
		
		Customer customer = new Customer();
		Student  student =  new Student();
		
		student.Log();
		customer.Log();		
	}
}
