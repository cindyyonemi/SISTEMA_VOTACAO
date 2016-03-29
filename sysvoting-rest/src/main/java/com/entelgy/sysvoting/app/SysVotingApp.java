package com.entelgy.sysvoting.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.entelgy.sysvoting.rest.VotingRestService;

/**
 * {@link Application} for configure REST services.
 * 
 * @author Cindy
 */
public class SysVotingApp extends Application {
	
	private Set<Object> singletons = new HashSet<Object>();

	public SysVotingApp() {
		singletons.add(new VotingRestService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
