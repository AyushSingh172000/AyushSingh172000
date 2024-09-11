package constructor;
import java.util.Scanner;
public class Program8 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st no. :");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd no. :");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd no. :");
		int c=sc.nextInt();
		System.out.println("Enter the 4th no. :");
		int d=sc.nextInt();
		if(a>b && a>c && a>d) {
			System.out.println("The biggest no is:"+a);
		}
		else if(b>c && b>d) {
			System.out.println("The biggest no is: "+b);
		}
		else if(c>d)
			System.out.println("The biggest no is: "+c);
		else
			System.out.println("The biggest no is: "+d);
}
}
