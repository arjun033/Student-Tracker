package com.isu.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String netId;
	@Column(name = "firstName", nullable = false)
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "performanceindicator")
	private PerformanceType performanceIndicator = PerformanceType.GREEN;	//Green by default;
	@Column(name = "term", nullable = false)
	private Term term;
	@Column(name = "year", nullable = false)
	private int year;
	@ManyToOne(fetch = FetchType.LAZY)
	private Group group;
	
	public String getNetId() {
		return netId;
	}
	public void setNetId(String netId) {
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
	public PerformanceType getPerformanceIndicator() {
		return performanceIndicator;
	}
	public void setPerformanceIndicator(PerformanceType performanceIndicator) {
		this.performanceIndicator = performanceIndicator;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public Term getTerm() {
		return term;
	}
	public void setTerm(Term term) {
		this.term = term;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
