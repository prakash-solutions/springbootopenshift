package com.cts.springbootopeshift.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.springbootopeshift.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
