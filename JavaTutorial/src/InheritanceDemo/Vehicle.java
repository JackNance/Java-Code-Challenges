package InheritanceDemo;

public class Vehicle {
	private String name;
	private int speed;
	private String direction;
	
	public Vehicle(String name) {
		super();
		this.name = name;
		this.speed = 0; //INITIALIZE TO ZERO SO PARAMETER IS NOT NEEDED IN CONSTRUCTOR
		this.direction = "North"; //INITIALIZE TO NORTH SO PARAMETER IS NOT NEEDED IN CONSTRUCTOR
	}
	
	public void stop() {
		System.out.println("Stopping vehicle");
		setSpeed(0);	
	}
	
	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		System.out.println("We are now heading " + direction);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		System.out.println("We are now moving " + speed + "MPH instead of " + this.speed + "MPH");
		this.speed = speed;
	}
	
	

}
