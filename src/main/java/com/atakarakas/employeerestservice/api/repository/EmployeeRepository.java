package com.atakarakas.employeerestservice.api.repository;

import com.atakarakas.employeerestservice.api.repository.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
