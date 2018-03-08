package com.cts.springbootopeshift.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.springbootopeshift.entity.Employee;
import com.cts.springbootopeshift.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Iterable<Employee> addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return getAllEmployees();
	}

	public Iterable<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
}
