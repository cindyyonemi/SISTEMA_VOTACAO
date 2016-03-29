package com.entelgy.sysvoting.repository;

import java.util.List;

import com.entelgy.sysvoting.entity.Voting;
import com.entelgy.sysvoting.repository.generic.GenericRepository;

public interface VotingRepository  extends GenericRepository<Voting, Long> {

	List<Voting> findByGroupOption();
	
	Integer findCount();
}
