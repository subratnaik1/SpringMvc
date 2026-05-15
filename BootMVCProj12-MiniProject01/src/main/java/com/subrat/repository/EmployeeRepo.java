package com.subrat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
