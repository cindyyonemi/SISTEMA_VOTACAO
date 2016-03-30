package com.entelgy.sysvoting.rest;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@RequestMapping("/voting")
public class VotingRestService extends GenericCrudRestService<Voting, Long>{
	
	@Autowired
	private VotingService votingService;
	
	protected GenericCrudService<Voting, Long> getService() {
		return this.votingService;
	}

	@RequestMapping(value = "/partialPercentage", method = RequestMethod.GET)
	public @ResponseBody List<Voting> getPartialPercentage() throws BusinessException{
		return votingService.findByGroupOption();
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public @ResponseBody Voting insert(@RequestBody Voting voting) throws BusinessException{
		votingService.insert(voting);
		return voting;
	}

}