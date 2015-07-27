package com.el.cms.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.el.app.model.BaseModel;

@Entity
@Table(name = "users")
public class User extends BaseModel {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;

	private String firstName;
	private String lastName;

	private String email;
	private String phone;

	private Status status;
	
	private Set<Role> roles = new HashSet<Role>();

	@NotNull(message = "username shall not be null")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@NotNull(message = "password shall not be null")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public enum Status {
		ACTIVE, INACTIVE
	}
}
