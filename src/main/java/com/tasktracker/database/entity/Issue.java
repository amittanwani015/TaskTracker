package com.tasktracker.database.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ISSUE")
public class Issue {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long issueId;
	
	private String description;
	private Date raisedOn;
	private int status;
	
	@ManyToOne
	@JoinColumn(name="task_id")	
	private Task taskAssociated;
	
	@ManyToOne
	@JoinColumn(name="raised_by")
	private User raisedBy;	
	
	@OneToMany(mappedBy="issueAssociated")
	private Set<IssueLog> issueLogs;
	
	public long getIssueId() {
		return issueId;
	}
	public void setIssueId(long issueId) {
		this.issueId = issueId;
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
	public User getRaisedBy() {
		return raisedBy;
	}
	public void setRaisedBy(User raisedBy) {
		this.raisedBy = raisedBy;
	}
	public Date getRaisedOn() {
		return raisedOn;
	}
	public void setRaisedOn(Date raisedOn) {
		this.raisedOn = raisedOn;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}	
}
