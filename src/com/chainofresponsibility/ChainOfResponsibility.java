package com.behavioralpatterns.chainofresponsibility;

/* Configure and calling of Chain of Responsibility */
public class ChainOfResponsibility {

	public static void main(String [] args) {
		
		//Configure Chain of Responsibility
		IChain c1 = new PassPositiveValue();
		IChain c2 = new PassNegativeValue();
		IChain c3 = new PassEqualValue();
		c1.setNext(c2);
		c2.setNext(c3);
		
		//Calling Chain of Responsibility
		c1.process(new PassInputValues(-2));
		c1.process(new PassInputValues(24));
		c1.process(new PassInputValues(0));
	}
}
