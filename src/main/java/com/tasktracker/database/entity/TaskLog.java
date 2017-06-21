package com.tasktracker.database.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TASK_LOG")
public class TaskLog {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long taskLogId;
	
	@ManyToOne
	@JoinColumn(name="task_id")
	private Task taskAssociated;
	
	private int statusChangedFrom;
	private int statusChangedTo;
	private Date loggedDate;
	private String comments;
	
	public long getTaskLogId() {
		return taskLogId;
	}
	public void setTaskLogId(long taskLogId) {
		this.taskLogId = taskLogId;
	}
	public Task getTaskAssociated() {
		return taskAssociated;
	}
	public void setTaskAssociated(Task taskAssociated) {
		this.taskAssociated = taskAssociated;
	}
	public int getStatusChangedFrom() {
		return statusChangedFrom;
	}
	public void setStatusChangedFrom(int statusChangedFrom) {
		this.statusChangedFrom = statusChangedFrom;
	}
	public int getStatusChangedTo() {
		return statusChangedTo;
	}
	public void setStatusChangedTo(int statusChangedTo) {
		this.statusChangedTo = statusChangedTo;
	}
	public Date getLoggedDate() {
		return loggedDate;
	}
	public void setLoggedDate(Date loggedDate) {
		this.loggedDate = loggedDate;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}	
}
