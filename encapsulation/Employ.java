package encapsulation;
import java.util.Scanner;
public class Employ {
	private int s_pin=1998;
	int u_pin;
	private String name;
	private int id;
	private double salary;
	public String getName() {
		if(s_pin==u_pin) {
			System.out.println("Validation is Successfull!.... ");
			return name;
		}
		else {
			System.out.println("Validation is not Successfull!....");
			return null;
		}
		
	
	}
	public int getId() {
		if(s_pin==u_pin) {
			System.out.println("Validation is Successfull!....");
			return id;
		}
		else {
			System.out.println("Validation is not Successfull!....");
			return 0;
		}
		
	
	}
	public double getSalary() {
		if(s_pin==u_pin) {
			System.out.println("Validation is Successfull....!");
			return salary;
		}
		else {
			System.out.println("Validation is not Successfull....!");
			return 0;
			}
		
	}
	public void setName(String name) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the u_pin: ");
		u_pin=sc.nextInt();
		if(s_pin==u_pin) {
			System.out.println("Name is Set.");
			this.name=name;
		}
		else
			System.out.println("Invalid Pin....!");
			
		
	}
	public void setId(int id) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the u_pin: ");
		u_pin=sc.nextInt();
		if(s_pin==u_pin) {
			System.out.println("ID is Set.");
			this.id=id;
		}
		else
			System.out.println("Invalid Pin....!");
		
	}
	public void setSalary(double salary) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the u_pin: ");
		u_pin=sc.nextInt();
		if(s_pin==u_pin) {
			System.out.println("Salary is Set.");
			this.salary=salary;
		}
		else
			System.out.println("Invalid Pin....!");
		
	}

}
