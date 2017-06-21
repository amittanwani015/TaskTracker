package com.tasktracker.database.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	private String userName;
	private String userFirstName;
	private String userLastName;
	private String password;
	
	@OneToMany(mappedBy="raisedBy")
	private Set<Issue> issues;
	
	@OneToMany(mappedBy="userAssociated")
	private Set<EmployeeLeave> leaves;
	
	@ManyToMany(mappedBy="users")
	private Set<Task> tasks = new HashSet<Task>();
	
	@ManyToMany(mappedBy="users")
	private Set<Project> projects = new HashSet<Project>();
	
	public int getUserId() {
		return userId; 
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Issue> getIssues() {
		return issues;
	}
	public void setIssues(Set<Issue> issues) {
		this.issues = issues;
	}
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}	
}
