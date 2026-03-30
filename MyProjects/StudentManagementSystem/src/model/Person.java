package model;

public class Person {
	protected String name;
	protected int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name: " + name + " Age: " + age );
	}

}
