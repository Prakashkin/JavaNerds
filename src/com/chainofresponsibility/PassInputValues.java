package com.behavioralpatterns.chainofresponsibility;

/* This class will acts as a request object.*/
public class PassInputValues {

	private int l_iNumber;
	
	public PassInputValues(int l_iNumber) {
		this.l_iNumber = l_iNumber;
	}

	public int getL_iNumber() {
		return l_iNumber;
	}
	
}
