package com.dbs.dbsapp.dao.repos;

import com.dbs.dbsapp.dao.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
