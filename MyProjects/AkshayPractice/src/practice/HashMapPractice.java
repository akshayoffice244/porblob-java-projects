package practice;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "apple");
		map.put("2", "banana");
		map.put("3", "ginger");
		map.put("4", "potato");
		map.put("5", "tomato");
		
		
		map.put("6", "garlic");
		System.out.println(map);
	}

}
