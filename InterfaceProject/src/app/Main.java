package app;

import shape.Circle;
import shape.Rectangle;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(7.0);
		circle.printArea();
		Rectangle rect = new Rectangle(4,2);
		rect.printArea();

	}

}
