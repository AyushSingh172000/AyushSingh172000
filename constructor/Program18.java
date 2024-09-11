package constructor;

import java.util.Scanner;

public class Program18 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the 1st angle of the triangle: ");
			int a=sc.nextInt();
			System.out.println("Enter the 2nd angle of the triangle: ");
			int b=sc.nextInt();
			System.out.println("Enter the 3rd angle of the triangle: ");
			int c=sc.nextInt();
			if(a==b && b==c && c==a)
				System.out.println("Traingle is Equilateral.");
			else if(a==b)
				System.out.println("Triangle is Isosceles.");
			else if(a+b>c && b+c>a && a+c>b)
				System.out.println("Triangle is Scalene.");
			
		}

}
