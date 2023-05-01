package com.example.springserver.service;


import com.example.springserver.entity.Employee;
import com.example.springserver.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        Streamable.of(employeeRepository.findAll())
                .forEach(employee-> {
                    employees.add(employee);
                });
        return employees;
    }

    public void deleteEmployee(Employee employee){
        employeeRepository.delete(employee);
    }


}
