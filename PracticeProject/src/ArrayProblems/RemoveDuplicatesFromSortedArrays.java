package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArrays {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		int point = 0;
		for(int i = 1; i<arr.length ; i++) {
			
			if(list.get(point) != arr[i]) {
				list.add(arr[i]);
				point++;
			}
		}
		
		System.out.println(list);
	}

}
