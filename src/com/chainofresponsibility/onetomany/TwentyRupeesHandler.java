package com.behavioralpatterns.chainofresponsibility.onetomany;

public class TwentyRupeesHandler implements RupeesHandler{

	private RupeesHandler m_objRupeesHandler;

	public void nextHandler(RupeesHandler p_rupeesHandler) {
		m_objRupeesHandler = p_rupeesHandler;
	}

	public void fetchRupees(long givenAmount) {
		long numberofNotesToBeFetched = givenAmount / 20;
		if (numberofNotesToBeFetched > 0) {
			if (numberofNotesToBeFetched > 1) {
				System.out.println(
						numberofNotesToBeFetched + " ==> Twenty Rupees notes are Fetched by TwentyRupeesHandler");
			} else {
				System.out.println(
						numberofNotesToBeFetched + " ==> Twenty Rupees note is Fetched by TwentyRupeesHandler");
			}
		}
		long pendingRupeesToBeProcessed = givenAmount % 20;
		if (pendingRupeesToBeProcessed > 0) {
			m_objRupeesHandler.fetchRupees(pendingRupeesToBeProcessed);
		}

	}

}
