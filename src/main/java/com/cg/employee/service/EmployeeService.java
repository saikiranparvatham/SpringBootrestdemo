package com.cg.employee.service;

import java.util.List;

import com.cg.employee.emp.Employee;



public interface EmployeeService {

	public void addNewEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
}