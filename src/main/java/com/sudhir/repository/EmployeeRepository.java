package com.sudhir.repository;

import org.springframework.data.repository.CrudRepository;

import com.sudhir.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
}
