package com.tasktracker.database.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MileStone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long mileStoneId;
	
	private String description;
	private Date startDate;
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name="project_id")
	private Project projectAssociated;

	public long getMileStoneId() {
		return mileStoneId;
	}

	public void setMileStoneId(long mileStoneId) {
		this.mileStoneId = mileStoneId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Project getProjectAssociated() {
		return projectAssociated;
	}

	public void setProjectAssociated(Project projectAssociated) {
		this.projectAssociated = projectAssociated;
	}	
}
