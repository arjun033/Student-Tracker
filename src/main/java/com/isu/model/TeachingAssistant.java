package com.isu.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ta")
public class TeachingAssistant extends User {

	private static final long serialVersionUID = 1L;
	@Column(name = "performanceindicator")
	private PerformanceType performanceIndicator;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ta")
	private List<Group> assignedGroups;
	
	public PerformanceType getPerformanceIndicator() {
		return performanceIndicator;
	}
	public void setPerformanceIndicator(PerformanceType performanceIndicator) {
		this.performanceIndicator = performanceIndicator;
	}
	public List<Group> getAssignedGroups() {
		return assignedGroups;
	}
	public void setAssignedGroups(List<Group> assignedGroups) {
		this.assignedGroups = assignedGroups;
	}
	
	
}
