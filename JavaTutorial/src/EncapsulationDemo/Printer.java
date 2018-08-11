package EncapsulationDemo;

public class Printer {

	private int tonerLevel = 100;
	private int pagesPrinted;
	private boolean isDuplex;
	
	public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
		super();
		if(tonerLevel > 0 && tonerLevel < 100) {
			this.tonerLevel = tonerLevel;
		}
		this.pagesPrinted = pagesPrinted;
		this.isDuplex = isDuplex;
	}
	
	public void fillToner(int toner) {
		if(toner < 1) {
			System.out.println("You can only increase the toner with a positive number");
		}
		if(this.tonerLevel + toner > 100) {
			this.tonerLevel = 100;
			System.out.println("Toner level is 100%");
		}
		else {
			this.tonerLevel += toner;
			System.out.println("The toner level is " + this.tonerLevel + "%");
		}
	}

	public void printPages(int pages) {
		if (pages < 1) {
			System.out.println("You can only a positive number of pages");
		}
		else {
			pagesPrinted += pages;
			System.out.println(pagesPrinted + " pages have been printed");
		}
	}
	public int getTonerLevel() {
		return tonerLevel;
	}

	public void setTonerLevel(int tonerLevel) {
		this.tonerLevel = tonerLevel;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

	public void setPagesPrinted(int pagesPrinted) {
		this.pagesPrinted = pagesPrinted;
	}

	public boolean isDuplex() {
		return isDuplex;
	}

	public void setDuplex(boolean isDuplex) {
		this.isDuplex = isDuplex;
	}
	
	
}
