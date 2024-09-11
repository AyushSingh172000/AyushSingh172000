package constructor;
import java.util.Scanner;
public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
			System.out.println("Character is Uppercase Alphabet.");
		else if(ch>='a' && ch<='z')
			System.out.println("Character is Lowercase Alphabet.");
		else
			System.out.println("Invalid Input");
	}

}
