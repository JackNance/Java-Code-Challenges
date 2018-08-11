package InheritanceDemo;

public class Car extends Vehicle{

	private int wheels;
	private int doors;
	private String gear;
	
	public Car(String name, int wheels, int doors) {
		super(name);
		this.wheels = wheels;
		this.doors = doors;
		this.gear = "Park";
	}
	
	public void shiftGears(String gear) {
		System.out.println("We are shifting gears from " + this.gear + " to " + gear);
		setGear(gear);
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}
	
}
