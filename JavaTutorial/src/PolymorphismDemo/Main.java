package PolymorphismDemo;

public class Main {

	public static void main(String[] args) {
		CarPoly cp = new CarPoly("T-Bird", 4, 90);
		cp.startEngine();
		cp.accelerate(50);
		cp.accelerate(150);
		cp.brake(20);
		cp.brake(160);
		cp.stopEngine();
		
		Yugo yug = new Yugo("Yug", 4, 80);
		yug.startEngine();
		yug.accelerate(50);
		yug.accelerate(150);
		yug.brake(20);
		yug.brake(160);
		yug.stopEngine();
		
		Ferrari fer = new Ferrari("Ferrari", 4, 190);
		fer.startEngine();
		fer.accelerate(50);
		fer.accelerate(150);
		fer.brake(20);
		fer.brake(160);
		fer.stopEngine();

	}

}
