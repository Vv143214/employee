package com.emp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emp.entity.Employee;

@Repository
public interface EmpDao extends CrudRepository<Employee, String> {

	

}
