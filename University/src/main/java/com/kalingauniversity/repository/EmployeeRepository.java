package com.kalingauniversity.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kalingauniversity.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
