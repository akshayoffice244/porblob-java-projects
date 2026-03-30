package App;

import vehicle.*;

public class Main {

	public static void main(String[] args) {
		Vehicle bike = new Bike("Royal Enfield", 100);
		Vehicle car = new Car("Buggati", 200);
		bike.Start();
		car.Start();
		car.displayInfo();

	}

}
