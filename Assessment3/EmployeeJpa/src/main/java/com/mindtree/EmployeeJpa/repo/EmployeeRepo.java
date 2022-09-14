package com.mindtree.EmployeeJpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.EmployeeJpa.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
