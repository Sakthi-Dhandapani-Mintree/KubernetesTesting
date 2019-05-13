package com.kalingauniversity.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kalingauniversity.dao.EmployeeDao;
import com.kalingauniversity.model.Employee;
import com.kalingauniversity.repository.EmployeeRepository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	EmployeeRepository empRepo;
	
	@Override
	public List<Employee> getEmployee() {
		 
		return empRepo.findAll();
	}

}
