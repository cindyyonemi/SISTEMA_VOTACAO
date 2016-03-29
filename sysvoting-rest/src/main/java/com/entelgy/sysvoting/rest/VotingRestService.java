package com.entelgy.sysvoting.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entelgy.sysvoting.business.VotingService;
import com.entelgy.sysvoting.business.generic.GenericCrudService;
import com.entelgy.sysvoting.entity.Voting;
import com.entelgy.sysvoting.entity.common.BusinessException;
import com.entelgy.sysvoting.rest.generic.GenericCrudRestService;

/**
 * Class for create end-point Voting.
 * 
 * @author Cindy
 */
@Component
@Path("/voting")
public class VotingRestService extends GenericCrudRestService<Voting, Long>{
	
	@Autowired
	private VotingService votingService;
	
	protected GenericCrudService<Voting, Long> getService() {
		return this.votingService;
	}

	@GET
	@Path("/partialPercentage")
	public Response getPartialPercentage() throws BusinessException{
		return Response.status(200).entity(votingService.findByGroupOption()).build();
	}
	
	@POST
	@Path("/insert")
	public Voting insert(Voting voting) throws BusinessException{
		votingService.insert(voting);
		return voting;
	}

}