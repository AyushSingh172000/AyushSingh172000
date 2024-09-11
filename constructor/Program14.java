package constructor;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			System.out.println("Entered Character is Alphabet.");
		else if(ch>='1' && ch<='9')
			System.out.println("Entered Character is Digit.");
		else
			System.out.println("Entered Character is Special.");

	}

}
