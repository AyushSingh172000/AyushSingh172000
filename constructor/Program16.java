package constructor;
import java.util.Scanner;
public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Side of the triangle: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd Side of the triangle: ");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd Side of the triangle: ");
		int c=sc.nextInt();
		if(a+b>c && b+c>a && a+c>b)
			System.out.println("Traingle is Valid.");
		else
			System.out.println("Triangle is Invalid.");
		
	}

}
