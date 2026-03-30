package mypackage;


 interface Vehicle{
	 void changeGear(int gear);
	 void speedUp(int speed);
	 void applyBrake(Boolean isBraking);
 }
 
 class Car implements Vehicle{

	 int gear ;
	 int speed;
	 Boolean isBraking;
	@Override
	public void changeGear(int gear) {
		this.gear = gear;
		System.out.println("Changed gear to : " + gear);
		
	}

	@Override
	public void speedUp(int speed) {
		this.speed = speed;
		System.out.println("Changing speed to: "+speed);
		
	}

	@Override
	public void applyBrake(Boolean isBraking) {
		this.isBraking = isBraking;
		if(isBraking) {
			System.out.println("Applying brakes");
		}
	}
	 
 }
public class InterfaceExamples {
 
	
	public static void main(String[] args) {
		Car car = new Car();
		car.changeGear(1);
		car.speedUp(20);
		car.applyBrake(true);

	}

}
