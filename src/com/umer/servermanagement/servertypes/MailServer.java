package com.umer.servermanagement.servertypes;

public class MailServer implements IServer{

	@Override
	public void resolve() {
		System.out.println("Performing some complex Mail server resolution algolrithm.");
		System.out.println("Mail Server is fixed.");
	}

}
