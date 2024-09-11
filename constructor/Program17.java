package constructor;
import java.util.Scanner;
public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st angle of the triangle: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd angle of the triangle: ");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd angle of the triangle: ");
		int c=sc.nextInt();
		if(a+b+c==180)
			System.out.println("Traingle is Valid.");
		else
			System.out.println("Triangle is Invalid.");
		
	}

}
