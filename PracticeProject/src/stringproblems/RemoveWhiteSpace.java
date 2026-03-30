package stringproblems;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string with space");
		String input = sc.nextLine();
		System.out.println(input);
		StringBuffer str = new StringBuffer();
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) != ' ') {
				str.append(input.charAt(i));
				//continue;
			}
		}
		System.out.println(str);
	}

}
