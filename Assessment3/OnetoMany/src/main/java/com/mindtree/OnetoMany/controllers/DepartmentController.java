package com.mindtree.OnetoMany.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.OnetoMany.entity.Department;
import com.mindtree.OnetoMany.repository.DepartmentRepository;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentRepository deprep;
	
//	@GetMapping("/")
	
	@PostMapping("/newdep")
	public String newdep(@RequestBody Department dep) {
		deprep.save(dep);
		
		return "New Department of id="+dep.getDepid();
	}

}
