package mypackage;

public class StringMethods {

	public static void main(String[] args) {
		String str = "GeeksforGeeks";
		System.out.println("Using naive method: ");
		for(int  i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println("");
		System.out.println("Using second method: ");
		char[] strArr = str.toCharArray();
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}

	}

}
