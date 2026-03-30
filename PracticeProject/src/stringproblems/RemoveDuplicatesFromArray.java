package stringproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromArray {

	static List<Integer> removeDuplicatesNormal(int[] arr){
		
		List<Integer> list = new ArrayList<>();
		for(int item : arr) {
			if(!list.contains(item)) {
				list.add(item);
			}
		}
		return list;
	}
	

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4,4,5};
		System.out.println("Removed Duplicates" + removeDuplicatesNormal(arr));

	}

}
