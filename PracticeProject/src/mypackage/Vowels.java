package mypackage;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		//is the char vowel?
		char a;
		Scanner sc = new Scanner(System.in);
		a = sc.next().toLowerCase().charAt(0);
		if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' ) {
			System.out.println(a +  " is a vowel");
		}else {
			System.out.println(a +  " is not a vowel");
		}
		
	}

}
