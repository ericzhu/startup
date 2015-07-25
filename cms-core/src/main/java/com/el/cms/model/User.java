package com.el.cms.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.el.app.model.BaseModel;

@Entity
@Table(name="users")
public class User extends BaseModel {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
