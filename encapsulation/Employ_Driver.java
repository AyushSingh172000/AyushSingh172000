package encapsulation;

public class Employ_Driver {

	public static void main(String[] args) {
		Employ e1=new Employ();
		e1.setName("Ayush");
		e1.setId(1);
		e1.setSalary(12500.50);
		System.out.println("===============================");
		System.out.println("Name is: "+e1.getName());
		System.out.println("ID is: "+e1.getId());
		System.out.println("Salary is: "+e1.getSalary());
		//System.out.println("===============================");
		System.out.println("===========Thank You!===========");

	}

}
