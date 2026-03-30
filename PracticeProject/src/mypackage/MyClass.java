package mypackage;

import java.util.Scanner;

 class TestClass{
	final int students = 20;
	
}
public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i =1; i <= n; i++) {
			sum +=i;
		}
		System.out.println("Sum of first " + n + " numbers is: " + sum);
	}

}
