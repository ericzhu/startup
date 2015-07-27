package com.el.cms.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.el.app.model.BaseModel;

@Entity
@Table(name="roles")
public class Role extends BaseModel {

	private static final long serialVersionUID = 1L;

	private String name;

	private String description;

	private RoleType roleType;

	@NotNull
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

	@NotNull
	public RoleType getRoleType() {
		return roleType;
	}

	public void setRoleType(RoleType roleType) {
		this.roleType = roleType;
	}

	public enum RoleType {
		ADMINISTRATOR, PUBLISHER, AUDITOR
	}
}
