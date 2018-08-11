package CompositionDemo;

public class Room {
	
	private Window theWindow;
	private Door theDoor;
	
	public Window getTheWindow() {
		return theWindow;
	}

	public void setTheWindow(Window theWindow) {
		this.theWindow = theWindow;
	}

	public Room(Window theWindow, Door theDoor) {
		super();
		this.theWindow = theWindow;
		this.theDoor = theDoor;
	}
	
	public void closeDoor(Door theDoor) {
		theDoor.closeDoor();
	}
	
	public void openDoor(Door theDoor) {
		theDoor.openDoor();
	}

}
