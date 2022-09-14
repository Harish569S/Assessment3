package com.mindtree.EmployeeJpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.EmployeeJpa.Impl.EmployyImpl;
import com.mindtree.EmployeeJpa.model.Employee;
import com.mindtree.EmployeeJpa.repo.EmployeeRepo;


@RestController
class RestControll implements EmployyImpl {
	@Autowired
	EmployeeRepo emp;
	
	@Override
	@GetMapping("/employee")
	public List<Employee> displayAll() {
		List<Employee> a=emp.findAll();
		return a;
	}
	@Override
	@GetMapping("/employee/{id}")
	public Optional<Employee> displayById(@PathVariable(name="id") int i) {
		Optional<Employee> a=emp.findById(i);
		return a;
	}
	
	@Override
	@PostMapping("/new")
	public Employee addEmployee(@RequestBody Employee e)
	{
		Employee a=emp.save(e);
		return a;
	}
	
	@Override
	@PostMapping("/employeeid/{id}/upsal/{sal}")
	public Employee updateSalary(@PathVariable int id,@PathVariable int sal) {
		Employee user=emp.findById(id).get();
		user.setSalary(sal);
		emp.save(user);
		return user;
	}
	@Override
	@PostMapping("/employeeid/{id}/name/{name}")
	public Employee updateName(@PathVariable int id,@PathVariable String name) {
		Employee user=emp.findById(id).get();
		user.setName(name);
		emp.save(user);
		return user;
	}
	
	@Override
	@DeleteMapping("/delete/{id}")
	public String deleteOne(@PathVariable int id) {
		int i=emp.findById(id).get().getId();
		emp.deleteById(id);
		return "Your Employee details of Id "+i+" is deleted";
		
	}
	@Override
	@DeleteMapping("/deleteall")
	public String deleteall() {
		emp.deleteAll();
		return "Deleted all your employee information";
	}
	
	
}
