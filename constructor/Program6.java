package constructor;
import java.util.Scanner;
public class Program6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st side of the triangle: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd side of the triangle: ");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd side of the triangle: ");
		int c=sc.nextInt();
		String result=(a==b && a==c) ?  "Equilateral Triangle":  "Not An Equlateral Triangle";
		System.out.println(result);
	}

}
