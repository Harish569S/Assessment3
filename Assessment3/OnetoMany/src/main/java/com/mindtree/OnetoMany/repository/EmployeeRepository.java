package com.mindtree.OnetoMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.OnetoMany.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
