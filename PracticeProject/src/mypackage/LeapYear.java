package mypackage;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleas enter year in YYYY format: ");
		if(sc.hasNextInt())
		{
			int year = sc.nextInt();
			if(year % 4 == 0) {
				System.out.println(year + " is a leap year.");
			}else {
				System.out.println(year + " is not a leap year.");
			}
		}else {
			System.out.println("Please enter a number value for year");
		}
		

	}

}
