package com.el.cms.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.el.app.model.BaseModel;

@Entity
@Table(name="groups")
public class Group extends BaseModel {

	private static final long serialVersionUID = 1L;

	private String name;
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
