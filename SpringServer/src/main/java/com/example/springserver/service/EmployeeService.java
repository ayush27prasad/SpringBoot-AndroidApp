package com.example.springserver.service;

import com.example.springserver.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public Employee saveEmployee(Employee employee);
    public void deleteEmployee(Employee employee);

}
