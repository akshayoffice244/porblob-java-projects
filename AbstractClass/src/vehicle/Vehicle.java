package vehicle;

public abstract class Vehicle {
	String name;
	int speed;
	public Vehicle(String name, int speed){
		this.name = name;
		this.speed = speed;
	}
	
	abstract public void Start();
	
	public  void displayInfo() {
		System.out.println("Vehicle name: " + name);
		System.out.println("Speed: " +speed);
	}

}
