package mypackage;

import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = sc.nextInt();
		
		System.out.println("Enter second number: ");
		b = sc.nextInt();
		
		System.out.println("Enter third number: ");
		c = sc.nextInt();
				
		if((a > b) && (a > c)) {
			System.out.println(a + " is the largest number.");
		}else if((b > a) && (b > c)) {
			System.out.println(b + " is the largest number");
		}if(( c > b) && (c > b)) {
			System.out.println(c + " is the largest number");
		}else {
			System.out.println("All number are equal");
		}
		
	} 

}
