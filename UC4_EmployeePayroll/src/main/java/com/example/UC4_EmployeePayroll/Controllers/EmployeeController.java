package com.example.UC4_EmployeePayroll.Controllers;

import com.example.UC4_EmployeePayroll.Services.EmployeeService;
import com.example.UC4_EmployeePayroll.Models.Employee;
import com.example.UC4_EmployeePayroll.Models.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService; // Injecting Service Layer

    @PostMapping("/add")
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employee) {
        return employeeService.saveEmployee(employee); // Delegating to Service
    }

    @GetMapping("/all")
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployee(); // Delegating to Service
    }
}