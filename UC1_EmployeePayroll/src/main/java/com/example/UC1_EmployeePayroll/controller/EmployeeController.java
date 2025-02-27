package com.example.UC1_EmployeePayroll.controller;

import com.example.UC1_EmployeePayroll.models.EmployeeEntity;
import com.example.UC1_EmployeePayroll.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<EmployeeEntity> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeEntity getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeByID(id);

    }

    @PostMapping
    public EmployeeEntity saveEmployees(@RequestBody EmployeeEntity employee) {
        return  employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public EmployeeEntity updateEmployees(@PathVariable Long id,@RequestBody EmployeeEntity employee){
        return employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);

        return "Employee with "+id+" is deleted";
    }
}