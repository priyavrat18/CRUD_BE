package com.priyavrat.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyavrat.restful.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
