package com.el.app.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.LockModeType;

import com.el.app.model.BaseModel;
import com.el.app.query.Filter;
import com.el.app.query.Page;
import com.el.app.query.Pageable;
import com.el.app.query.Sort;

public interface BaseRepository<T extends BaseModel, ID extends Serializable> {

	T find(ID id);

	T find(ID id, LockModeType lockModeType);

	public List<T> findList(Integer first, Integer count, List<Filter> filters, List<Sort> sorts);

	public Page<T> findPage(Pageable pageable);

	public long count(Filter... filters);

	void save(T model);

	T update(T model);

	void delete(T model);

	void refresh(T model);

	void refresh(T model, LockModeType lockModeType);

	ID getIdentifier(T model);

	boolean isManaged(T model);

	void detach(T model);

	void lock(T model, LockModeType lockModeType);

	void clear();

	void flush();
}
