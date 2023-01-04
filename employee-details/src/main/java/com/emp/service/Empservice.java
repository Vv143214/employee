package com.emp.service;

import org.springframework.http.ResponseEntity;

import com.emp.entity.Employee;

public interface Empservice {
	public Iterable<Employee> viewAllEmployee();

	public Employee viewEmployee(String employeeCode);

	public ResponseEntity<?> addEmployee(Employee employee);

	public Employee modifyEmployee(Employee employee);

	public String removeEmployee(String employeeCode);

	
}