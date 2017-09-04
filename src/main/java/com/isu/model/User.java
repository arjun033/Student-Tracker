package com.isu.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private String netId;
	@Column(name = "firstname", nullable = false)
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "role")
	private String role = "TA";		//The default role is TA
	
	public String geNetId() {
		return netId;
	}
	public void setUserName(String netId) {
		this.netId = netId;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
