package org.standardbank.backend;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.standardbank.backend.rotationsetup.BehaviouralRequirementsModel;
import org.standardbank.backend.rotationsetup.BehaviouralRequirementsService;

@Path("/behaviouralrequirements")
public class BehaviouralRequirements {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<BehaviouralRequirementsModel> getBehaviouralRequirements(){
		BehaviouralRequirementsService behaviouralRequirements = new BehaviouralRequirementsService();
		
		return behaviouralRequirements.addBehaviouralRequirements();
	}

}
