package com.chainofresponsibility.onetomany;

/* This interface will acts as a chain link.*/
public interface RupeesHandler {
	void nextHandler(RupeesHandler l_RupeesHandler);

	void fetchRupees(long l_GivenAmount);
}
