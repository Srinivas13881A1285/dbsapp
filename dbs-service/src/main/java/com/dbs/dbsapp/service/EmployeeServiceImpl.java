package com.dbs.dbsapp.service;

import com.dbs.dbsapp.dao.mongo.Employee;
import com.dbs.dbsapp.dao.mongo.repos.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmp(Employee employee) {
        return  this.employeeRepository.save(employee);
    }

    @Override
    public Iterable<Employee> getEmployees() {
        return this.employeeRepository.findAll();
    }
}
