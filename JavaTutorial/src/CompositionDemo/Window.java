package CompositionDemo;

public class Window {

		private boolean isOpen;
		private boolean isCovered;
		private Dimensions dimensions;
		
		public Window(Dimensions dimensions) {
			super();
			this.isOpen = false;
			this.isCovered= false;
			this.dimensions = dimensions;
		}

		public void closeWindow() {
			if(this.isOpen){
				isOpen = false;
				System.out.println("The window is closed now.");
			} else {
				System.out.println("The window was alredy closed.");
			}
		}
		
		public void openWindow() {
			if(!this.isOpen){
				isOpen = true;
				System.out.println("The window is open now.");
			} else {
				System.out.println("The window was alredy open.");
			}
		}
		
		public void closeShade() {
			if(!this.isCovered){
				isCovered = true;
				System.out.println("The shade is closed now.");
			} else {
				System.out.println("The shade was alredy closed.");
			}
		}
		
		public void openShade() {
			if(this.isCovered){
				isCovered = false;
				System.out.println("The shade is open now.");
			} else {
				System.out.println("The shade was alredy open.");
			}
		}

		public boolean isOpen() {
			return isOpen;
		}

		public void setOpen(boolean isOpen) {
			this.isOpen = isOpen;
		}

		public boolean isCovered() {
			return isCovered;
		}

		public void setCovered(boolean isCovered) {
			this.isCovered = isCovered;
		}

		
	
}
