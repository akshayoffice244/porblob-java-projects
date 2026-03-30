package app;

import java.util.Scanner;

import handler.StudentManager;
import model.Student;

public class App {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			StudentManager manager = new StudentManager();
			int exit = 1;
			while(exit == 1) {
				
				 System.out.println("\n1. Add Student");
		         System.out.println("2. View All");
		         System.out.println("3. Search Student");
		         System.out.println("4. Remove Student");
		         System.out.println("5. Exit");

		         int choice = sc.nextInt();
		         switch(choice) {
		         case 1:
	                    System.out.print("Enter ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter Name: ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter Age: ");
	                    int age = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter Course: ");
	                    String course = sc.nextLine();

	                    manager.addStudent(new Student(id, name, age, course));
	                    break;

	                case 2:
	                    manager.displayAll();
	                    break;

	                case 3:
	                    System.out.print("Enter ID: ");
	                    manager.searchStudent(sc.nextInt());
	                    break;

	                case 4:
	                    System.out.print("Enter ID: ");
	                    manager.removeStudent(sc.nextInt());
	                    break;

	                case 5:
	                	exit = 0;
	                	sc.close();
	                	break;
	                		
		         
		         }
		            
		            
		            
			}
			
		
	}

}
