package com.cts.springbootopeshift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.springbootopeshift.entity.Employee;
import com.cts.springbootopeshift.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(path = "/add")
	public @ResponseBody Iterable<Employee> addEmployee(@RequestParam String firstName, @RequestParam String lastName,
			@RequestParam String email) {

		Employee newEmployee = new Employee();
		newEmployee.setFirstName(firstName);
		newEmployee.setLastName(lastName);
		newEmployee.setEmail(email);
		employeeService.addEmployee(newEmployee);
		return employeeService.getAllEmployees();

	}

	@GetMapping(path = "/all")
	public @ResponseBody List<Employee> getAllEmployee() {

		return employeeService.getAllEmployees();

	}

}
