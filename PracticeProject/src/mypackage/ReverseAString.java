package mypackage;

import java.util.Scanner;

public class ReverseAString {
//naive method
	static void reverseString(String strToReverse) {
		String str = "";
		for(int i = strToReverse.length()-1; i >= 0; i--  ) {
			str+=strToReverse.charAt(i);
		}
		System.out.println(str);
	}
	static void stringReverseBuiltIn(String strToReverse) {
		StringBuffer str = new StringBuffer(strToReverse);
	 str.reverse();
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word or sentence to reverse: ");
		String reverseMe = sc.next();
		
		stringReverseBuiltIn(reverseMe);
	}

}
