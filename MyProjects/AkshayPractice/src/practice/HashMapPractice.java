package practice;

import java.util.HashMap;
import java.util.Map;

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
		Map<String, String> m1=new HashMap<String, String>();
		//Upcasting HashMap to Map Interface
		m1.put("student 1", "Manish");
		//Adds a new key: value pair to the map
		m1.put("student 2", "Abhishek");
		m1.put("student 3", "Sunita");
		m1.put("student 4", "Jeetu");
		System.out.println(m1);
	}

}
