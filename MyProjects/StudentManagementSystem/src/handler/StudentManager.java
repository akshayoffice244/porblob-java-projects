package handler;

import java.util.HashMap;

import model.Student;

public class StudentManager {
	private HashMap<Integer, Student> studentMap = new HashMap<>();
	
	
	public void addStudent(Student s) {
		if(!studentMap.containsKey(s.getId())) {
			studentMap.put(s.getId(), s);
		}
	}
	
	public void displayAll() {
		for(Student s:  studentMap.values()) {
			s.display();
		}
	}
	
	 public void searchStudent(int id) {
		 if(studentMap.containsKey(id)) {
			 studentMap.get(id).display();
		 }else {
			 System.out.println("Record not found!");
		 }
	 }
	 
	 public void removeStudent(int id) {
		 Student s =	 studentMap.remove(id);
		 if(s != null) {
			 System.out.println("Student removed.");
		 }else {
			 System.out.println("Record doesn't exists!");
		 }
	 }

}
