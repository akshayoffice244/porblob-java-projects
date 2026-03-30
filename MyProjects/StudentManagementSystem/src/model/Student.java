package model;

public class Student extends Person{

	private int id;
	private String course;
	public Student(int id, String name, int age, String course) {
		super(name, age);
		this.id = id;
		this.course = course;
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	
	public void display() {
		System.out.println("Id: " + id);
		super.display();
		System.out.println("Course: "+ course);
		System.out.println("-------------------");
	}
}
