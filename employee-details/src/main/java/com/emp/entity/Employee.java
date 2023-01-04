package com.emp.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	private String employeeCode;
	private String employeeLocation;
	private String employeeName;
	public String getemployeeCode() {
		// TODO Auto-generated method stub
		return null;
	}
}
