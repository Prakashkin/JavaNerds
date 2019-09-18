package com.chainofresponsibility.onetomany;

public class HundredRupeesHandler implements RupeesHandler{

	private RupeesHandler m_objRupeesHandler;

	public void nextHandler(RupeesHandler p_rupeesHandler) {
		m_objRupeesHandler = p_rupeesHandler;
	}

	public void fetchRupees(long givenAmount) {
		long numberofNotesToBeFetched = givenAmount / 100;
		if (numberofNotesToBeFetched > 0) {
			if (numberofNotesToBeFetched > 1) {
				System.out.println(
						numberofNotesToBeFetched + " ==> Hundred Rupees notes are Fetched by HundredRupeesHandler");
			} else {
				System.out.println(
						numberofNotesToBeFetched + " ==> Hundred Rupees note is Fetched by HundredRupeesHandler");
			}

		}

		long pendingRupeesToBeProcessed = givenAmount % 100;

		if (pendingRupeesToBeProcessed > 0) {
			m_objRupeesHandler.fetchRupees(pendingRupeesToBeProcessed);
		}
	}
	
}
