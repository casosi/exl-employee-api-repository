package com.exlemployeeapi.employees;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private String id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String jobTitle;
	private Date birthDate;
	private Date hireDate;
	private Date separationDate;
	
	public Employee() {
		
	}

	public Employee(String id, String firstName, String middleName, String lastName, String jobTitle, Date birthDate,
			Date hireDate, Date separationDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
		this.separationDate = separationDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Date getSeparationDate() {
		return separationDate;
	}

	public void setSeparationDate(Date separationDate) {
		this.separationDate = separationDate;
	}
}
