package com.dbs.dbsapp.service;

import com.dbs.dbsapp.dao.model.Employee;
import com.dbs.dbsapp.dao.repos.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public String deleteEmployee(Long id) {
         this.employeeRepository.deleteById(id);
         return "deleted successfully";
    }

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
