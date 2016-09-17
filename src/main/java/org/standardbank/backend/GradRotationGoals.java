package org.standardbank.backend;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.standardbank.backend.rotationsetup.EmployeeGoalsModel;
import org.standardbank.backend.rotationsetup.EmployeeGoalsService;

@Path("rotation_goals")
public class GradRotationGoals {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<EmployeeGoalsModel> getGoals(){
		EmployeeGoalsService goalsService = new EmployeeGoalsService();
		
		return goalsService.addGoals();
	}

}
