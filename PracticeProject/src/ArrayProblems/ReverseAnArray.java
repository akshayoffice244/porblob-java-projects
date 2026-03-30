package ArrayProblems;

import java.util.Arrays;

public class ReverseAnArray {
	
	public static void reverseAnArray(int[] arr) {
		int n = arr.length;
	  for(int i = 0; i < n/2; i++) {
		  int temp = arr[i];
		  arr[i] = arr[n -i -1];
		  arr[n - i -1] = temp;
	  }
	  
	  for(int item : arr) {
		  System.out.print(item +", ");
	  }
	  
	}
	public static void main(String[] args) {
		  int[] arr = { 1, 4, 3, 2, 6, 5 };
		  
		  reverseAnArray(arr);
	}

}
