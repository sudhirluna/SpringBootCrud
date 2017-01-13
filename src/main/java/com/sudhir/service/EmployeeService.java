package com.sudhir.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudhir.entity.Employee;
import com.sudhir.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		List<Employee> employeeList = new ArrayList<>();
		Iterable<Employee> itr = employeeRepository.findAll();
		for (Employee e : itr) {
			employeeList.add(e);
		}
		return employeeList;
	}

	public Employee getEmployee(int employeeId) {
		return employeeRepository.findOne(employeeId);

	}

	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void deleteEmployee(int employeeId) {
		employeeRepository.delete(employeeId);
	}
}
