package com.cts.springbootopeshift.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.springbootopeshift.entity.Employee;
import com.cts.springbootopeshift.repository.MyListRepository;

@Service
public class EmployeeService {

	/*
	 * @Autowired
	 * private EmployeeRepository employeeRepository;
	 */

	@Autowired
	private MyListRepository myListRepository;

	public List<Employee> addEmployee(Employee employee) {
		myListRepository.save(employee);
		return getAllEmployees();
	}

	public List<Employee> getAllEmployees() {

		List<Employee> employeeList = new ArrayList<Employee>();

		for (Employee employee : myListRepository.findAll()) {
			employeeList.add(employee);
		}
		return employeeList;
	}
}
