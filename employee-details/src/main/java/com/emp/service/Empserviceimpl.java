package com.emp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.emp.dao.EmpDao;
import com.emp.entity.Employee;

@Service
public class Empserviceimpl implements Empservice {
	@Autowired
	EmpDao empDao;

	/*
	 * view all Employees
	 */
	@Override
	public Iterable<Employee> viewAllEmployee() {
		return empDao.findAll();
	}

	/*
	 * view Employee by employeeCode
	 */
	@Override
	public Employee viewEmployee(String employeeCode) {
		Optional<Employee> findById = empDao.findById(employeeCode);
		
			return findById.get();
	}
	@Override
	public ResponseEntity<?> addEmployee(Employee employee) {
		Optional<Employee> findById = empDao.findById(employee.toString());
		empDao.save(employee);
			return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		
	
		}
	

	/*
	 * modify an Employee
	 */
	@Override
	public Employee modifyEmployee(Employee employee) {
		Optional<Employee> findById = empDao.findById(employee.getemployeeCode());
		
			empDao.save(employee);
		
		return employee;
	}

	/*
	 * remove an Employee
	 */
	@Override
	public String removeEmployee(String employeeCode) {
		Optional<Employee> findById = empDao.findById(employeeCode);
		
			empDao.deleteById(employeeCode);
			return "removed";
		
	}
}