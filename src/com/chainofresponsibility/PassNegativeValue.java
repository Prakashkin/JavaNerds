package com.chainofresponsibility;

/* This class will accept only negative values.*/
public class PassNegativeValue implements IChain{
	
	/*Java Dependency Injection*/
	private IChain Ichain;

	public void setNext(IChain c) {
		Ichain = c;
	}

	public void process(PassInputValues l_objRequest) {
		if(l_objRequest.getL_iNumber() < 0) {
			System.out.println("Negative Value is : " + l_objRequest.getL_iNumber());
		}
		else {
			Ichain.process(l_objRequest);
		}
	}
	

}
