package org.standardbank.backend;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.standardbank.backend.model.LoginDetails;
import org.standardbank.backend.service.LoginDetailsService;

@Path("login")
public class UserAccount {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<LoginDetails> userLogin(){
		LoginDetailsService loginDetailsService = new LoginDetailsService();
		
		return loginDetailsService.getLoginDetails();
	}
}
