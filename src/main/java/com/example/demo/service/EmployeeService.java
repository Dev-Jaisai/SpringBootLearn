package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public String saveEmployee(Employee e){
        employeeRepo.save(e);
        return "Employee data has been save";
    }
}
