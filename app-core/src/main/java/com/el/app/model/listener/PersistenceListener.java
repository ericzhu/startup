package com.el.app.model.listener;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.el.app.model.BaseModel;

public class PersistenceListener {
	@PrePersist
	public void prePersist(BaseModel model) {
		model.setCreateDate(new Date());
		model.setModifyDate(new Date());
	}

	@PreUpdate
	public void preUpdate(BaseModel model) {
		model.setModifyDate(new Date());
	}
}
