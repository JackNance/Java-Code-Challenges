package OOPChallenge;

public class Burger {

	private String breadType;
	private String temperature;
	private int numberOfToppings;
	private int maxToppings;
	private boolean canAdd;
	private double basePrice;
	private double totalPrice;
	private String allToppings;
	
	public Burger(String temperature) {
		super();
		this.breadType = "sesame bun";
		this.temperature = temperature;
		this.numberOfToppings = 0;
		this.maxToppings = 0;
		this.canAdd = true;
		this.basePrice = 5.95;
		this.totalPrice = basePrice;
		this.allToppings = "";
	}

	public String getBreadType() {
		return breadType;
	}

	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public int getNumberOfToppings() {
		return numberOfToppings;
	}

	public void setNumberOfToppings(int numberOfToppings) {
		this.numberOfToppings = numberOfToppings;
	}

	public boolean isCanAdd() {
		return canAdd;
	}

	public void setCanAdd(boolean canAdd) {
		this.canAdd = canAdd;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getAllToppings() {
		return allToppings;
	}

	public void setAllToppings(String allToppings) {
		this.allToppings = allToppings;
	}

	public int getMaxToppings() {
		return maxToppings;
	}

	public void setMaxToppings(int maxToppings) {
		this.maxToppings = maxToppings;
	}
	
	
}
