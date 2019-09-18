package com.chainofresponsibility.onetomany;

public class FiveHundredRupeesHandler implements RupeesHandler{

	private RupeesHandler m_objRupeesHandler;
	
	public void nextHandler(RupeesHandler p_rupeesHandler) {
		m_objRupeesHandler = p_rupeesHandler;
	}

	public void fetchRupees(long givenAmount) {
		
		long numberofNotesToBeFetched = givenAmount / 500;
			if (numberofNotesToBeFetched > 1) {
				System.out.println(numberofNotesToBeFetched
						+ " ==> Five Hundred Rupees notes are Fetched by FiveHundredRupeesHandler");
			} else {
				System.out.println(numberofNotesToBeFetched
						+ " ==> Five Hundred Rupees note are Fetched by FiveHundredRupeesHandler");
			}
		

		long pendingRupeesToBeProcessed = givenAmount % 500;

		if (pendingRupeesToBeProcessed > 0) {
			m_objRupeesHandler.fetchRupees(pendingRupeesToBeProcessed);
		}
		
	}

}
