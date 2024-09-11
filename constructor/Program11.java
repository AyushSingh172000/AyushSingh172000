package constructor;
import java.util.Scanner;
public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
			System.out.println("Entered Character is an Uppercase Character.");
		else if(ch>='a' && ch<='z')
			System.out.println("Entered Character is a Lowercase Character.");
		else
			System.out.println("Wrong Input");

	}

}
