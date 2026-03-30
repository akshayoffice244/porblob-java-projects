package mypackage;

import java.util.Arrays;
import java.util.List;

public class ForEachLoop {
	
	
	
	int sum;

	public static void main(String[] args) {
//		String[] arr = {"java", "kotlin","c#","javascript","flutter"};
//		System.out.println("Array");
//		for(String item: arr) {
//			System.out.println(item);
//		}
		List<String> list = Arrays.asList("one", "two", "three", "four", "five");
		
		
		
		System.out.println("names");
		for(String name: list) {
			System.out.println(name);
		}

	}
	
	ForEachLoop(int sum){
		this.sum = sum;
	}

}
