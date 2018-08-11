package InheritanceDemo;

public class Honda extends Car{

	private int roadService;

	public Honda(int roadService) {
		super("Honda", 4, 4); //SET VALUES OF NAME, WHEELS, DOORS FROM THE CAR CLASS
		this.roadService = roadService;
	}

	public int getRoadService() {
		return roadService;
	}

	public void setRoadService(int roadService) {
		this.roadService = roadService;
	}
	
	
}
