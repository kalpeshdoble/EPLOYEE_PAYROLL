package com.example.UC6_EmployeePayroll.controllers;

import com.example.UC6_EmployeePayroll.models.Employee;
import com.example.UC6_EmployeePayroll.models.EmployeeDTO;
import com.example.UC6_EmployeePayroll.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/all")
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        boolean isDeleted = employeeService.deleteEmployee(id);
        return isDeleted ? "Employee deleted successfully!" : "Employee not found!";
    }
}