package com.tasktracker.database.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TASK")
public class Task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long taskId;
	
	private String subject;
	private String description;
	private Date startDate;
	private Date endDate;
	private Date sitDate;
	private Date uatDate;
	private Date productionReleaseDate;
	private int status;
	private float estimatedHr;
	private String jiraNo;
	private String layer;
	private String domainModel;
	private String sqlQuery;	
	
	@ManyToOne
	@JoinColumn(name="project_id")
	private Project projectAssociated;
	
	@OneToMany(mappedBy="taskAssociated")
	private Set<Issue> issues;
	
	@OneToMany(mappedBy="taskAssociated")
	private Set<WorkLog> worklogs;
	
	@OneToMany(mappedBy="taskAssociated")
	private Set<TaskLog> tasklogs;	
	
	@ManyToMany
	@JoinTable(name="TASK_USER_MAPPING", 
				joinColumns={@JoinColumn(name="TASK_ID")}, 
				inverseJoinColumns={@JoinColumn(name="USER_ID")})
	private Set<User> users = new HashSet<User>();
	
	public long getTaskId() {
		return taskId;
	}
	public void setTaskId(long taskId) {
		this.taskId = taskId;
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
	public Date getSitDate() {
		return sitDate;
	}
	public void setSitDate(Date sitDate) {
		this.sitDate = sitDate;
	}
	public Date getUatDate() {
		return uatDate;
	}
	public void setUatDate(Date uatDate) {
		this.uatDate = uatDate;
	}
	public Date getProductionReleaseDate() {
		return productionReleaseDate;
	}
	public void setProductionReleaseDate(Date productionReleaseDate) {
		this.productionReleaseDate = productionReleaseDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public float getEstimatedHr() {
		return estimatedHr;
	}
	public void setEstimatedHr(float estimatedHr) {
		this.estimatedHr = estimatedHr;
	}
	public String getJiraNo() {
		return jiraNo;
	}
	public void setJiraNo(String jiraNo) {
		this.jiraNo = jiraNo;
	}
	public String getLayer() {
		return layer;
	}
	public void setLayer(String layer) {
		this.layer = layer;
	}
	public String getDomainModel() {
		return domainModel;
	}
	public void setDomainModel(String domainModel) {
		this.domainModel = domainModel;
	}
	public String getSqlQuery() {
		return sqlQuery;
	}
	public void setSqlQuery(String sqlQuery) {
		this.sqlQuery = sqlQuery;
	}
	public Project getProjectId() {
		return projectAssociated;
	}
	public void setProjectId(Project projectId) {
		this.projectAssociated = projectId;
	}
	public Set<Issue> getIssues() {
		return issues;
	}
	public void setIssues(Set<Issue> issues) {
		this.issues = issues;
	}
	public Set<WorkLog> getWorklogs() {
		return worklogs;
	}
	public void setWorklogs(Set<WorkLog> worklogs) {
		this.worklogs = worklogs;
	}	
}
