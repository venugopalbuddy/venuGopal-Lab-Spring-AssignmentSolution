package com.greatLearning.studentManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="student")
@Data
public class Student {

	// define fields

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;


	@Column(name="firstName")
	private String firstName;


	@Column(name="lastName")
	private String lastName;


	@Column(name="department")
	private String department;
	
	@Column(name="country")
	private String country;

	public Student()
	{
		
	}
	
	public Student(String firstName, String lastName, String department, String country) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.country = country;
	}

	

}











