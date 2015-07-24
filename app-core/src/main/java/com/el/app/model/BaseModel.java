package com.el.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.el.app.model.listener.PersistenceListener;

@MappedSuperclass
@EntityListeners({ PersistenceListener.class })
public abstract class BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String CREATE_DATE_PROPERTY_NAME = "createDate";

	public static final String MODIFY_DATE_PROPERTY_NAME = "modifyDate";

	protected Long id;
	protected Date createDate;
	protected Date modifyDate;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
}
