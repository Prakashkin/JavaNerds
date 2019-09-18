package com.chainofresponsibility.onetomany;

public class FiftyRupeesHandler implements RupeesHandler{

	private RupeesHandler m_objRupeesHandler;
	
	public void nextHandler(RupeesHandler p_rupeesHandler) {
		m_objRupeesHandler = p_rupeesHandler;
	}

	public void fetchRupees(long givenAmount) {
		long numberofNotesToBeFetched = givenAmount / 50;
		if (numberofNotesToBeFetched > 0) {
			if (numberofNotesToBeFetched > 1) {
				System.out.println(
						numberofNotesToBeFetched + " ==> Fifty Rupees notes are Fetched by FiftyRupeesHandler");
			} else {
				System.out
						.println(numberofNotesToBeFetched + " ==> Fifty Rupees note is Fetched by FiftyRupeesHandler");
			}
		}

		long pendingRupeesToBeProcessed = givenAmount % 50;

		if (pendingRupeesToBeProcessed > 0) {
			m_objRupeesHandler.fetchRupees(pendingRupeesToBeProcessed);
		}
	}

}
