package constructor;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		String result=(((n%5==0) && (n%11==0))? n +" is divisible by both." : n +" is not divisible by both.");
		System.out.println(result);
		

	}

}
