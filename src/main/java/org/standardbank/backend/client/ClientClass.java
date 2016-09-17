package org.standardbank.backend.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.eclipse.persistence.oxm.MediaType;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = ClientBuilder.newClient();
		
		String message = client.target("http://localhost:8080/authentication/webapi/login")
				.request().get(String.class);
		
		System.out.println(message);

	}

}
