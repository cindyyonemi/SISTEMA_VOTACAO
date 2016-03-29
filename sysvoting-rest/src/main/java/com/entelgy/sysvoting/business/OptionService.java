package com.entelgy.sysvoting.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entelgy.sysvoting.business.generic.GenericCrudService;
import com.entelgy.sysvoting.entity.Option;
import com.entelgy.sysvoting.repository.OptionRepository;
import com.entelgy.sysvoting.repository.generic.GenericRepository;


/**
 * The OptionService class provides the business operations of entity {@link Option}.
 * 
 */
@Service("optionService")
public class OptionService extends GenericCrudService<Option, Long> {

	@Autowired
	private OptionRepository optionRepository;

	@Override
	protected GenericRepository<Option, Long> getRepository() {
		return this.optionRepository;
	}

	public List<Option> findByAll() {
		return this.optionRepository.findAll();
	}
	
}
