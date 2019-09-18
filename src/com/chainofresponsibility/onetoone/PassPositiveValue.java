package com.chainofresponsibility.onetoone;

/* This class will accept only positive values.*/
public class PassPositiveValue implements IChain{

	/*Java Dependency Injection*/
	private IChain Ichain;
	
	public void setNext(IChain c) {
		Ichain = c;
	}

	public void process(PassInputValues l_objRequest) {
		if(l_objRequest.getL_iNumber() > 0) {
			System.out.println("Positive Value is : " + l_objRequest.getL_iNumber());
		}
		else {
			Ichain.process(l_objRequest);
		}
		
	}

}
