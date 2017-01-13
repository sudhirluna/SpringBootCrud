package com.sudhir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sudhir.entity.Employee;
import com.sudhir.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/employees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@RequestMapping("/employees/{empId}")
	public Employee findEmployee(@PathVariable int empId) {
		return employeeService.getEmployee(empId);
	}

	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	public void saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}

	@RequestMapping(value = "/employees", method = RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}

	@RequestMapping(value = "/employees/{empId}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable int empId) {
		employeeService.deleteEmployee(empId);
	}
}
