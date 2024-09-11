package constructor;
import java.util.Scanner;
public class Program1 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String result=(n>100&&n<999?n+"is 3-digit number":n+"is not 3-digit number");
		System.out.println(result);
	}
	

}
