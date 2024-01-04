package com.postrgresql.SpringbootappwithpostgresqlDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.postrgresql.SpringbootappwithpostgresqlDB.model.Employee;
import com.postrgresql.SpringbootappwithpostgresqlDB.repository.EmployeeRepository;

@Component
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRespository;

	public Employee addEmployee(Employee employee) {
		return employeeRespository.save(employee);
	}
	
	public List<Employee> getEmployee() {
		return employeeRespository.findAll();
	}
	
	public Employee getEmployee(int employeeId) {
		return employeeRespository.findById(employeeId).get();
	}
	
	public Employee updateEmployee(int employeeId, Employee employee) {
		employee.setId(employeeId);
		return employeeRespository.save(employee);
	}
	
	public String deleteEmployee(int employeeId) {
		employeeRespository.deleteById(employeeId);
		return "Employee with id " + employeeId + " record deleted successfully";
	}
	
}
