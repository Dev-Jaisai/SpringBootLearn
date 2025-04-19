package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiController")//address define
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {

        employeeService.saveEmployee(employee);

        return new ResponseEntity<>("Data has been save", HttpStatus.CREATED);
    }


    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getEmployeeDat() {
        List<Employee> allemployeeData = employeeService.getAllemployeeData();
        return new ResponseEntity<>(allemployeeData, HttpStatus.OK);
    }

}
