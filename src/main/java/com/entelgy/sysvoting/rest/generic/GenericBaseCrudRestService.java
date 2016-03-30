package com.entelgy.sysvoting.rest.generic;

import java.io.Serializable;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

import com.entelgy.sysvoting.entity.common.BusinessException;
import com.entelgy.sysvoting.business.generic.GenericCrudService;

/**
 * The GenericCrudRestServer class.
 *
 * @param <T>
 *            Entity type.
 * @param <K>
 *            Key type.
 *
 */
public abstract class GenericBaseCrudRestService<T extends Serializable, K extends Serializable> {

	@POST
	public T insert(T entity) throws BusinessException {
		this.getService().insert(entity);
		return entity;
	}

	@PUT
	public T update(T entity) throws BusinessException {
		this.getService().update(entity);
		return entity;
	}

	@GET
	public List<T> getAll() {
		return this.getService().getAll();
	}

	protected abstract GenericCrudService<T, K> getService();
}
