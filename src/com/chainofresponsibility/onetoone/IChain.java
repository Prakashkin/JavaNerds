package com.behavioralpatterns.chainofresponsibility.onetoone;

/* This interface will acts as a chain link.*/
public interface IChain {
	
	void setNext(IChain nextInChain);
	void process(PassInputValues l_objRequest);

}
