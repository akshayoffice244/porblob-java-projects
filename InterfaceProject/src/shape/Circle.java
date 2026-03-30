package shape;

public class Circle implements Shape{
	double radius;
	public Circle(double r){
		radius = r;
	}
	
	@Override
	public double calculateArea() {
		
		
		return Math.PI * radius * radius;
	}

	@Override
	public void displayShape() {
		System.out.println("Circle");
		
	}

	@Override
	public void printArea() {
		System.out.println("Area of Circle: " + calculateArea());
		
	}

}
