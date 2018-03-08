package com.cts.springbootopeshift.repository;

import java.util.ArrayList;
import java.util.List;

import com.cts.springbootopeshift.entity.Employee;

public class MyListRepository {

	public static List<Employee> employeeList = new ArrayList<Employee>();

	public void save(Employee employee) {

		employeeList.add(employee);
	}

	public List<Employee> findAll() {

		return employeeList;
	}

}
