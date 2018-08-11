package EncapsulationDemo;

public class Main {

	public static void main(String[] args) {
		Printer printer = new Printer(1000, 0, false);
		Printer emptyPrinter = new Printer(2, 0, false);
		
		printer.fillToner(7);
		printer.printPages(70);
		
		emptyPrinter.printPages(8);
		emptyPrinter.fillToner(75);
		
	}

}
