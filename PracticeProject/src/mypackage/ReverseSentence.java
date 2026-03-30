package mypackage;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = sc.next();
		StringBuffer word = new StringBuffer();
		Stack<String> myStack = new Stack<String>();
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) != '.') {
				word.append(input.charAt(i));
			}else if(word.length() > 0) {
				myStack.push(word.toString());
				word.setLength(0);
			}
		}
		if(word.length() > 0) {
			myStack.push(word.toString());
			word.setLength(0);
		}
		StringBuffer result = new StringBuffer();
		while(!myStack.isEmpty()) {
			result.append(myStack.pop());
			if(!myStack.isEmpty()) {
				result.append(".");
			}
		}
		System.out.println(result);
		
		
	}

}
