package com.tasktracker.database.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PROJECT")
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int projectId;
	
	private String projectName;
	private String projectDescription;
	private String clientSpoc;
	private String domain;
	
	@OneToMany(mappedBy="projectAssociated")
	private Set<Task> tasks;	
	
	@OneToMany(mappedBy="projectAssociated")
	private Set<MileStone> mileStones;
	
	@ManyToMany
	@JoinTable(name="PROJECT_USER_MAPPING", 
				joinColumns={@JoinColumn(name="PROJECT_ID")}, 
				inverseJoinColumns={@JoinColumn(name="USER_ID")})
	private Set<User> users = new HashSet<User>();
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getClientSoc() {
		return clientSpoc;
	}
	public void setClientSoc(String clientSoc) {
		this.clientSpoc = clientSoc;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public Set<Task> getTasks() {
		return tasks;
	}
	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
}
