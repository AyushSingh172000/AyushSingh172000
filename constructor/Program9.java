package constructor;
import java.util.Scanner;
public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year=sc.nextInt();
		if(year%4==0)
			System.out.println("It is a Leap year");
		else
			System.out.println("It is not a Leap Year");
	}

}
