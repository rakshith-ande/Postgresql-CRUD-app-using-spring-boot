package com.postrgresql.SpringbootappwithpostgresqlDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postrgresql.SpringbootappwithpostgresqlDB.model.Employee;
import com.postrgresql.SpringbootappwithpostgresqlDB.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/getEmployee")
	public List<Employee> getEmployee() {
		return employeeService.getEmployee();
	}
	
	@GetMapping("/getEmployee/{employeeId}")
	public Employee getEmployee(@PathVariable("employeeId") int employeeId) {
		return employeeService.getEmployee(employeeId);
	}
	
	@PutMapping("/updateEmployee/{employeeId}")
	public Employee updateEmployee(@PathVariable("employeeId") int employeeId, @RequestBody Employee employee) {
		return employeeService.updateEmployee(employeeId, employee);
	}
	
	@DeleteMapping("/deleteEmployee/{employeeId}")
	public String deleteEmployee(@PathVariable("employeeId") int employeeId) {
		return employeeService.deleteEmployee(employeeId);
	}
	
}
