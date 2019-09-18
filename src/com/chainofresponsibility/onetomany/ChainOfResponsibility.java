package com.behavioralpatterns.chainofresponsibility.onetomany;

public class ChainOfResponsibility {
	
	public static void main(String [] args) {
		RupeesHandler c1 = new FiveHundredRupeesHandler();
		RupeesHandler c2 = new HundredRupeesHandler();
		RupeesHandler c3 = new FiftyRupeesHandler();
		RupeesHandler c4 = new TwentyRupeesHandler();
		RupeesHandler c5 = new FiveRupeesHandler();

		// Configure Chain of Responsibility
		c1.nextHandler(c2);
		c2.nextHandler(c3);
		c3.nextHandler(c4);
		c4.nextHandler(c5);

		// Calling Chain of Responsibility
		System.out.println("\n ----------------Paid Amount 1755-----------------------\n");
		c1.fetchRupees(1755);
		System.out.println("\n ----------------Paid Amount 2275-----------------------\n");
		c1.fetchRupees(2275);
	}

}