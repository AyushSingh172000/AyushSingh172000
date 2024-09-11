package constructor;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch=sc.next().charAt(0);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='E'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("Entered Character is Vowel.");
		else
			System.out.println("Entered Character is Consonant.");

	}

}
