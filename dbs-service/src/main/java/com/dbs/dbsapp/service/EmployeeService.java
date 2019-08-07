package com.dbs.dbsapp.service;

import com.dbs.dbsapp.dao.model.Employee;

public interface EmployeeService {

    Employee createEmp(Employee employee);
    Iterable<Employee> getEmployees();
    String deleteEmployee(Long id);
}
