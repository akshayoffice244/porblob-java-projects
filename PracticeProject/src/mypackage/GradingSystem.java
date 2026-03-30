package mypackage;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your percentage : ");
		float percentage = sc.nextFloat();
		if(percentage >= 85.0 ) {
			System.out.println("You got A grade with " + percentage +  "%");
		}else if(percentage >= 75.0) {
			System.out.println("You got B grade with " + percentage +  "%");
		}else if(percentage >= 65.0) {
			System.out.println("You got C grade with " + percentage +  "%");
		}else if(percentage >= 55.0) {
			System.out.println("You got D grade with " + percentage +  "%");
		}else if(percentage >= 35.0) {
			System.out.println("You got E grade with " + percentage +  "%");
		}else {
			System.out.println("You got F grade with " + percentage +  "%");
		}
		

	}

}
