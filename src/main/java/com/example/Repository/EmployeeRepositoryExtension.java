package com.example.Repository;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeRepositoryExtension {
	public List<Employee> findByLastName(String lastName);
}
