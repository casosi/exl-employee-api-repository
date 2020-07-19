package com.exlemployeeapi.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	// GET all Employees
	public List<Employee> getAllEmployees() {		
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}
	
	// GET Employee by id
	public Optional<Employee> getEmployee(String id) {
		return employeeRepository.findById(id);
	}

	// POST (insert) new Employee
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	// PUT (update) existing Employee
	public void updateEmployee(String id, Employee employee) {
		employeeRepository.save(employee);
	}
	
	// DELETE Employee
	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}
}
