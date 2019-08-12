package com.dbs.dbsapp.restcontrollers;

import com.dbs.dbsapp.dao.model.Employee;
import com.dbs.dbsapp.dao.model.User;
import com.dbs.dbsapp.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> getEmployees(){
        return new ResponseEntity<>(this.employeeService.getEmployees(), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable(value = "id")final Long id){
        System.out.println("delete method called :"+id);
        return this.employeeService.deleteEmployee(id);
    }

    @GetMapping("/validateLogin")
    public User validateLogin(){
        // perform findbyid for user details.
        return new User("User successfully authenticated");
    }

}
