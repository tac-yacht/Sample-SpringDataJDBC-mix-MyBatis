package com.example.Repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>, EmployeeRepositoryExtension {
	@Query("SELECT * FROM employee WHERE first_name = :firstName")
	public List<Employee> findByFirstName(@Param("firstName") String firstName);
}
