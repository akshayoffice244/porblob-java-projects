package stringproblems;

import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeatingChars {

	 static String firstNonRepeatingCharacter(String str) {
		List<Character> letters = new ArrayList<Character>();
		for(Character ch : str.toCharArray()) {
			letters.add(ch);
		}
		for(Character ch: letters) {
			if(letters.indexOf(ch) == letters.lastIndexOf(ch) )
			{
				return ch.toString();
			}
		}
		
		return "\0";
	}
	public static void main(String[] args) {
		String input = "aabcceff";
		List<Character> letters = new ArrayList<>();
		
		System.out.println("First non repeating letter is: "+ firstNonRepeatingCharacter(input));
		
				

	}

}
