package com.atakarakas.employeerestservice.api.service;

import com.atakarakas.employeerestservice.api.repository.EmployeeRepository;
import com.atakarakas.employeerestservice.api.repository.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService  {

    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }
    public long update(Employee employee){
        return employeeRepository.save(employee).getId();
    }
    public void delete(Employee employee){
        employeeRepository.delete(employee);
    }
    public void deleteById(long id){
        employeeRepository.deleteById(id);
    }
    public Optional<Employee> findById(long id){
        return employeeRepository.findById(id);
    }
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
}
