package com.chainofresponsibility;

/* This interface will acts as a chain link.*/
public interface IChain {
	
	public abstract void setNext(IChain nextInChain);
	public abstract void process(PassInputValues l_objRequest);

}
