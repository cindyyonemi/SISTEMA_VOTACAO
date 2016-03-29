package com.entelgy.sysvoting.repository.generic;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Interface of {@link GenericRepositoryJpa}.
 * 
 * @param <T>
 *            entity class
 * @param <K>
 *            tipo de chave
 */
public interface GenericRepository<T extends Serializable, K extends Serializable> {

	void insert(T entity);

	void update(T entity);

	void delete(K id);

	T findById(K id);

	List<T> findAll();

	List<?> findByJPQL(String jpql, Object... parans);

	List<?> findByJPQL(String jpql, Map<String, Object> parans);

	Object findSingleResultByJPQL(String jpql, Object... parans);

	Object findSingleResultByJPQL(String jpql, Map<String, Object> parans);

	int count();
}
