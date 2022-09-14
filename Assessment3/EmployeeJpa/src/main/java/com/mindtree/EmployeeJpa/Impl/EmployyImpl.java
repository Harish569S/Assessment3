package com.mindtree.EmployeeJpa.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mindtree.EmployeeJpa.model.Employee;

public interface EmployyImpl {

	List<Employee> displayAll();

	Optional<Employee> displayById(int i);

	Employee addEmployee(Employee e);

	Employee updateSalary(int id, int sal);

	Employee updateName(int id, String name);

	String deleteOne(int id);

	String deleteall();

}