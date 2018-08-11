package CompositionDemo;

public class Main {

	public static void main(String[] args) {

		Dimensions doorDimensions = new Dimensions(72, 42);
		Dimensions windowDimensions = new Dimensions(48, 48);
		Door theDoor = new Door(doorDimensions);
		Window theWindow = new Window(windowDimensions);
		Room theRoom = new Room(theWindow, theDoor);
		
		theRoom.getTheWindow().closeWindow();
		theRoom.getTheWindow().openWindow();
		theRoom.getTheWindow().closeWindow();
		theRoom.getTheWindow().closeWindow();
		theRoom.getTheWindow().openWindow();
		theRoom.getTheWindow().openWindow();
		
		theRoom.closeDoor(theDoor);
		theRoom.openDoor(theDoor);
		theRoom.openDoor(theDoor);
		theRoom.closeDoor(theDoor);

	}

}
