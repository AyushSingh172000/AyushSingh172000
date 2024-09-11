package constructor;
import java.util.Scanner;
public class Program5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet: ");
		char ch= sc.next().charAt(0);
		String result=(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U' || ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')? ch +"  is a Vowel." : ch +" is not Vowel.";
		System.out.println(result);
	}

}
