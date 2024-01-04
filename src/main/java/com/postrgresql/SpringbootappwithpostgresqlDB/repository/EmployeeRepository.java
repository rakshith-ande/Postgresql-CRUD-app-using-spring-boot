package com.postrgresql.SpringbootappwithpostgresqlDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postrgresql.SpringbootappwithpostgresqlDB.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
