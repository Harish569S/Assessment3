package com.mindtree.OnetoMany.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.OnetoMany.entity.Department;
import com.mindtree.OnetoMany.entity.Employee;
import com.mindtree.OnetoMany.repository.EmployeeRepository;

@RestController
public class EmployeeController {
    @Autowired
	EmployeeRepository emprep;

	@PostMapping("/newemp")
	public String newdep(@RequestBody Employee emp) {
		emprep.save(emp);
		
		return "New Department of id="+emp.getEmpId();
	}
}
