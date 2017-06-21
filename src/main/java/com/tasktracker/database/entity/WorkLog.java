package com.tasktracker.database.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="WORK_LOG")
public class WorkLog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long workLogId;
	
	private String subject;
	private String description;
	private float workingHour;
	
	@ManyToOne
	@JoinColumn(name="task_id")
	private Task taskAssociated;
	
	public long getWorkLogId() {
		return workLogId;
	}
	public void setWorkLogId(long workLogId) {
		this.workLogId = workLogId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Task getTaskAssociated() {
		return taskAssociated;
	}
	public void setTaskAssociated(Task taskAssociated) {
		this.taskAssociated = taskAssociated;
	}
	public float getWorkingHour() {
		return workingHour;
	}
	public void setWorkingHour(float workingHour) {
		this.workingHour = workingHour;
	}	
}
