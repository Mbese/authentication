package org.standardbank.backend;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.standardbank.backend.rotationsetup.JobAccountabilityModel;
import org.standardbank.backend.rotationsetup.JobAccountabilityService;

@Path("jobaccountability")
public class GradRoatationJobAccountability {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<JobAccountabilityModel> getJobAccountability(){
		JobAccountabilityService jobAccountability = new JobAccountabilityService();
		
		return jobAccountability.addJobAccountability();
	}

}
