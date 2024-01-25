package com.qsp.springbootstudent.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	@Column(unique = true)
	private long phone;
	@Column(unique = true)
	private String email;
	private int securedMarks;
	private int totalMarks;
	private double percentage;
	private String grade;
	
}
