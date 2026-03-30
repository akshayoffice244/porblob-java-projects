package vehicle;

public class Bike extends Vehicle {

	public Bike(String name, int speed) {
		super(name, speed);
		
	}

	@Override
	public void Start() {
		System.out.println("Starts with self or kick.");
		
	}

}
