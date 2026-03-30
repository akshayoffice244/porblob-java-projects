package shape;

public class Rectangle implements Shape {
	double length, width;
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
		
	}
	@Override
	public double calculateArea() {
		
		return length*width;
	}

	@Override
	public void displayShape() {
		System.out.println("Rectangle");
		
	}

	@Override
	public void printArea() {
		System.out.println("Area of rectangle: " + calculateArea());
		
	}

}
