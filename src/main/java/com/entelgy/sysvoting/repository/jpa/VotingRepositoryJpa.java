package com.entelgy.sysvoting.repository.jpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entelgy.sysvoting.entity.Voting;
import com.entelgy.sysvoting.repository.VotingRepository;
import com.entelgy.sysvoting.repository.jpa.generic.GenericRepositoryJpa;

/**
 * The OptionRepositoryJpa class provides the persistence operations of entity Voting
 * 
 */
@Repository("votingRepositoryJpa")
public class VotingRepositoryJpa extends GenericRepositoryJpa<Voting, Long> implements VotingRepository {

	@SuppressWarnings("unchecked")
	@Override
	public List<Voting> findByGroupOption() {

		List<Voting> lista = (List<Voting>) super.findByJPQL("SELECT new com.entelgy.sysvoting.entity.Voting(v.option, COUNT(v.option.id)) FROM Voting as v GROUP BY v.option.id");
		
		return lista;
	}
	
	@Override
	public Long findCount() {
		return (Long) super.findSingleResultByJPQL("SELECT COUNT(v.id) FROM Voting as v");
	}


}
