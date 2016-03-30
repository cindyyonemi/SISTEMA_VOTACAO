package com.entelgy.sysvoting.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entelgy.sysvoting.business.generic.GenericCrudService;
import com.entelgy.sysvoting.entity.Voting;
import com.entelgy.sysvoting.entity.common.BusinessException;
import com.entelgy.sysvoting.repository.VotingRepository;
import com.entelgy.sysvoting.repository.generic.GenericRepository;


/**
 * The VotingService class provides the business operations of entity {@link Voting}.
 * 
 */
@Service("votingService")
public class VotingService extends GenericCrudService<Voting, Long> {

	@Autowired
	private VotingRepository votingRepository;
	
	@Override
	protected GenericRepository<Voting, Long> getRepository() {
		return this.votingRepository;
	}
	
	public List<Voting> findByGroupOption() throws BusinessException{
		List<Voting> listVoting = new ArrayList<Voting>();
		try{
			List<Voting> list =  this.votingRepository.findByGroupOption();
			Long total = this.votingRepository.findCount();
			for (Voting obj : list) {
				Voting voting = new Voting();
				voting = obj;
				if (obj.getAmount() == null ||obj.getAmount() == 0){
					voting.setPercentage(0d);
				}else{
					voting.setPercentage((100d*obj.getAmount())/total);
				}
				listVoting.add(voting);
			}
		}catch (Exception e) {
			throw new BusinessException("Erro: " + e.getMessage());
		}
		return listVoting;
	}
	
	public void insert(Voting voting)  {
		voting.setDate(new Date());
		this.votingRepository.insert(voting);
	}
}
