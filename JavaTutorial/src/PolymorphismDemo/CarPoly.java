package PolymorphismDemo;

public class CarPoly {
	
	private String name;
	private boolean engine;
	private int wheels;
	private int cylinders;
	private int speed;
	private int maxSpeed;
	
	public CarPoly(String name, int cylinders, int maxSpeed) {
		super();
		this.name = name;
		this.engine = false;
		this.wheels = 4;
		this.cylinders = cylinders;
		this.speed = 0;
		this.maxSpeed = maxSpeed;
	}
	
	public void startEngine() {
		if(!engine) {
			engine = true;
			System.out.println(getClass().getSimpleName() + " Class: " + name + " started");
		}
		else {
			System.out.println(getClass().getSimpleName() + " Class: " + name + " was already started");
		}
	}
	
	public void stopEngine() {
		if(engine) {
			engine = false;
			System.out.println(getClass().getSimpleName() + " Class: " + name + " stopped");
		}
		else {
			System.out.println(getClass().getSimpleName() + " Class: " + name + " was already stopped");
		}
	}
	
	public void brake(int change) {
		if(change < 1) {
			System.out.println("Change must be at least 1 MPH");
		}
		if(change > speed) {
			speed = 0;
			System.out.println(getClass().getSimpleName() + " Class: Brakes applied.  Car stopped.");
		} else {
			speed -= change;
			System.out.println(getClass().getSimpleName() + " Class: Brakes applied.  Car slowed to " + speed + " MPH");
		}
	}
	
	public void accelerate(int change) {
		if(change < 1) {
			System.out.println("Change must be at least 1 MPH");
		}
		if(change + speed > this.maxSpeed) {
			speed = this.maxSpeed;
			System.out.println(getClass().getSimpleName() + " Class: Car accelerated. Maximum speed (" + this.maxSpeed + " MPH) reached");
		} else {
			speed += change;
			System.out.println(getClass().getSimpleName() + " Class: Car accelerated.  Car moving " + this.speed + " MPH");
		}
	}
	public String getName() {
		return name;
	}

	public boolean isEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getSpeed() {
		return speed;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
}

class Yugo extends CarPoly{

	public Yugo(String name, int cylinders, int maxSpeed) {
		super(name, cylinders, maxSpeed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		super.startEngine();
		System.out.println("Yugo Class: Yugo started");
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		super.stopEngine();
		System.out.println("Yugo Class: Yugo stopped");
	}

	@Override
	public void brake(int change) {
		// TODO Auto-generated method stub
		super.brake(change);
		System.out.println("Yugo Class: Yugo braking");
	}

	@Override
	public void accelerate(int change) {
		// TODO Auto-generated method stub
		super.accelerate(change);
		System.out.println("Yugo Class: Yugo accelerating");
	}
}
class Ferrari extends CarPoly {

	public Ferrari(String name, int cylinders, int maxSpeed) {
		super(name, cylinders, maxSpeed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		super.startEngine();
		System.out.println("Ferrari Class: Ferrari started");
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		super.stopEngine();
		System.out.println("Ferrari Class: Ferrari stopped");
	}

	@Override
	public void brake(int change) {
		// TODO Auto-generated method stub
		super.brake(change);
		System.out.println("Ferrari Class: Ferrari braking");
	}

	@Override
	public void accelerate(int change) {
		// TODO Auto-generated method stub
		super.accelerate(change);
		System.out.println("Ferrari Class: Ferrari accelerating");
	}
}




