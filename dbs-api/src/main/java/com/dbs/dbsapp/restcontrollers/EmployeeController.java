package com.dbs.dbsapp.restcontrollers;

import com.dbs.dbsapp.dao.model.Employee;
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


    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable(value = "id")final Long id){
        System.out.println("delete method called :"+id);
        return this.employeeService.deleteEmployee(id);
    }


}
