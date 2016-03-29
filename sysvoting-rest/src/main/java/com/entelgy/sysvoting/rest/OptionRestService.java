package com.entelgy.sysvoting.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entelgy.sysvoting.business.OptionService;
import com.entelgy.sysvoting.business.generic.GenericCrudService;
import com.entelgy.sysvoting.entity.Option;
import com.entelgy.sysvoting.entity.common.BusinessException;
import com.entelgy.sysvoting.rest.generic.GenericCrudRestService;

/**
 * Class for create end-point Option .
 * 
 * @author Cindy
 */
@Component
@Path("/option")
public class OptionRestService extends GenericCrudRestService<Option, Long>{
	
	@Autowired
	private OptionService optionService;
	
	@Override
	protected GenericCrudService<Option, Long> getService() {
		return this.optionService;
	}

	@GET
	@Path("/options")
	public Response getOptions() throws BusinessException{
		List<Option> list = this.optionService.findByAll();
		return Response.status(200).entity(list).build();
	}

}