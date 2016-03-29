package com.entelgy.sysvoting.repository.jpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entelgy.sysvoting.entity.Voting;
import com.entelgy.sysvoting.repository.VotingRepository;
import com.entelgy.sysvoting.repository.jpa.generic.GenericRepositoryJpa;

/**
 * The StudentRepositoryJpa class provides the persistence operations of entity Voting
 * 
 */
@Repository("votingRepositoryJpa")
public class VotingRepositoryJpa extends GenericRepositoryJpa<Voting, Long> implements VotingRepository {

	@SuppressWarnings("unchecked")
	@Override
	public List<Voting> findByGroupOption() {

		List<Voting> lista = (List<Voting>) super.findByJPQL("SELECT new com.entelgy.sysvoting.entity.Voting( option, COUNT(option.id)) FROM Voting GROUP BY Option.id");
		
		return lista;
	}
	
	@Override
	public Integer findCount() {
		return (Integer) super.findSingleResultByJPQL("SELECT COUNT(id) FROM Voting");
	}


}
