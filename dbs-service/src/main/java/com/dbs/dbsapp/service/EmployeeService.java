package com.dbs.dbsapp.service;

import com.dbs.dbsapp.dao.mongo.Employee;

public interface EmployeeService {

    Employee createEmp(Employee employee);
    Iterable<Employee> getEmployees();
}
