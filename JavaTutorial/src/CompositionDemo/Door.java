package CompositionDemo;

public class Door {
	private boolean isOpen;
	private Dimensions dimensions;
	
	public Door(Dimensions dimensions) {
		super();
		this.isOpen = false;
		this.dimensions = dimensions;
		
	}

	public void closeDoor() {
		if(this.isOpen){
			isOpen = false;
			System.out.println("The door is closed now.");
		} else {
			System.out.println("The door was alredy closed.");
		}
	}
	
	public void openDoor() {
		if(!this.isOpen){
			isOpen = true;
			System.out.println("The door is open now.");
		} else {
			System.out.println("The door was alredy open.");
		}
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	
}
