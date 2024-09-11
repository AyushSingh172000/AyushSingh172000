package constructor;
import java.util.Scanner;
public class Program2 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int a=sc.nextInt();
		System.out.println("Enter the Second number: ");
		int b=sc.nextInt();
		System.out.println("Enter the Third number: ");
		int c=sc.nextInt();
		int result=((a>b && a>c)?a:(b>a && b>c)?b:c);
		System.out.println("Biggest number is: " + result);
	}
	

}
