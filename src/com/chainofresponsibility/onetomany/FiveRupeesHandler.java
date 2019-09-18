package com.chainofresponsibility.onetomany;

public class FiveRupeesHandler implements RupeesHandler{

	private RupeesHandler m_objRupeesHandler;

	public void nextHandler(RupeesHandler p_rupeesHandler) {
		m_objRupeesHandler = p_rupeesHandler;
	}

	public void fetchRupees(long givenAmount) {
		long numberofNotesToBeFetched = givenAmount / 5;
		if (numberofNotesToBeFetched > 0) {
			if (numberofNotesToBeFetched > 1) {
				System.out.println(
						numberofNotesToBeFetched + " ==> Five Rupees notes are Fetched by FiveRupeesHandler \n");
			} else {
				System.out
						.println(numberofNotesToBeFetched + " ==> Five Rupees note is Fetched by FiveRupeesHandler \n");
			}
		}
		long pendingRupeesToBeProcessed = givenAmount % 5;
		if (pendingRupeesToBeProcessed > 0) {
			m_objRupeesHandler.fetchRupees(pendingRupeesToBeProcessed);
		}
	}
}
