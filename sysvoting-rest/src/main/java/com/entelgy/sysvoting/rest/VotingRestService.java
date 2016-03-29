package com.entelgy.sysvoting.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/voting")
public class VotingRestService {

	@GET
	@Path("/ping")
	public Response printMessage() {
		return Response.status(200).entity("pong").build();

	}

}