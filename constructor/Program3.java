package constructor;
import java.util.Scanner;
class Program3
{
	public static void main(String []args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd number: ");
		int c=sc.nextInt();
		System.out.println("Enter the 4th number: ");
		int d=sc.nextInt();
		int result=((a>b && a>c && a>d)?a:((b>c && b>d)?b:(c>d)?c:d));

		System.out.println("Biggest number is: "+result);
	}
	

}
