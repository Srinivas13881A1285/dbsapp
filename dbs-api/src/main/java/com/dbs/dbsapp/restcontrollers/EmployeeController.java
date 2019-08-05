package com.dbs.dbsapp.restcontrollers;

import com.dbs.dbsapp.dao.mongo.Employee;
import com.dbs.dbsapp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/new")
    public Employee createEmployee(@RequestBody Employee employee){
        return this.employeeService.createEmp(employee);
    }

    @GetMapping("/all")
    public Iterable<Employee> getEmployees(){
        return this.employeeService.getEmployees();
    }


}
