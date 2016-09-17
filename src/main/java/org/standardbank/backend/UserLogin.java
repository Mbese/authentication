package org.standardbank.backend;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("signin")
public class UserLogin {
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String showIt() {
        return "Working!";
    }

}
