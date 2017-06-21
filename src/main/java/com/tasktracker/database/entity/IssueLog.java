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
@Table(name="ISSUE_LOG")
public class IssueLog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long issueLogId;
	
	@ManyToOne
	@JoinColumn(name="issue_id")
	private Issue issueAssociated;
	
	private int statusChangedFrom;
	private int statusChangedTo;
	private Date loggedDate;
	private String comments;
	
	public long getIssueLogId() {
		return issueLogId;
	}
	public void setIssueLogId(long issueLogId) {
		this.issueLogId = issueLogId;
	}
	public Issue getIssueAssociated() {
		return issueAssociated;
	}
	public void setIssueAssociated(Issue issueAssociated) {
		this.issueAssociated = issueAssociated;
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
