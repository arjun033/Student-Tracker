package com.isu.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "group")
public class Group implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String groupId;
	@Column(name = "groupname", nullable = false)
	private String groupName;
	@Column(name = "performanceindicator")
	private PerformanceType performanceIndicator = PerformanceType.GREEN;	//Green by default
	@Column(name = "term", nullable = false)
	private Term term;
	@Column(name = "year", nullable = false)
	private int year;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "group")
	private List<Student> members;
	@ManyToOne(fetch = FetchType.LAZY)
	private TeachingAssistant ta;
	
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public PerformanceType getPerformanceIndicator() {
		return performanceIndicator;
	}
	public void setPerformanceIndicator(PerformanceType performanceIndicator) {
		this.performanceIndicator = performanceIndicator;
	}
	public List<Student> getMembers() {
		return members;
	}
	public void setMembers(List<Student> members) {
		this.members = members;
	}
	public TeachingAssistant getTa() {
		return ta;
	}
	public void setTa(TeachingAssistant ta) {
		this.ta = ta;
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
