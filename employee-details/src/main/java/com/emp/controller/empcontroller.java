package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.Employee;
import com.emp.service.Empservice;


@RestController
@RequestMapping("/employees")
public class empcontroller {
	@Autowired(required = true)
	Empservice empservice;

	@GetMapping("/viewEmployee/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public Employee viewEmployee(@PathVariable("id") String empid) {
		return empservice.viewEmployee(empid);
	}

	@GetMapping("/allEmployee")
	public Iterable<Employee> viewAllEmployee() {
		return empservice.viewAllEmployee();
	}

	@PostMapping("/addEmployee")
//	@ExceptionHandler(RecordAlreadyPresentException.class)
	public void addEmployee(@RequestBody Employee Employee) {
		empservice.addEmployee(Employee);
	}

	@PutMapping("/updateEmployee")
//	@ExceptionHandler(RecordNotFoundException.class)
	public void modifyEmployee(@RequestBody Employee Employee) {
		empservice.modifyEmployee(Employee);
	}

	@DeleteMapping("/deleteEmployee/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public void removeEmployee(@PathVariable("id")  String empid) {
		empservice.removeEmployee(empid);
	}
}