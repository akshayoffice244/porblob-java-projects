package vehicle;

public class Car extends Vehicle {

	public Car(String name, int speed) {
		super(name, speed);
	
	}

	@Override
	public void Start() {
		System.out.println("Starts with key ignition.");
		
	}

}
