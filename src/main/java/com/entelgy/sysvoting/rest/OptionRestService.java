package com.entelgy.sysvoting.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entelgy.sysvoting.business.OptionService;
import com.entelgy.sysvoting.business.generic.GenericCrudService;
import com.entelgy.sysvoting.entity.Option;
import com.entelgy.sysvoting.entity.common.BusinessException;
import com.entelgy.sysvoting.rest.generic.GenericBaseCrudRestService;

/**
 * Class for create end-point Option .
 * 
 * @author Cindy
 */
@RestController
@RequestMapping("/option")
public class OptionRestService extends GenericBaseCrudRestService<Option, Long>{
	
	@Autowired
	private OptionService optionService;
	
	@Override
	protected GenericCrudService<Option, Long> getService() {
		return this.optionService;
	}

	@RequestMapping(value = "/options", method = RequestMethod.GET)
	public @ResponseBody List<Option> getOptions() throws BusinessException{
		List<Option> list = this.optionService.findByAll();
		return list;
	}

}