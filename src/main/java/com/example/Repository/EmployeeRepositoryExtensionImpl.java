package com.example.Repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.entity.Employee;

public class EmployeeRepositoryExtensionImpl implements EmployeeRepositoryExtension {

    private final SqlSession sqlSession;

    public EmployeeRepositoryExtensionImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

	@Override
	public List<Employee> findByLastName(String lastName) {
		return this.sqlSession.selectList("com.example.mapper.findByName", lastName);
	}
}
