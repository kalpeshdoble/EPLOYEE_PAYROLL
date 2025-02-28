package com.example.UC3_EmployeePayroll.Controllers;

import com.example.UC3_EmployeePayroll.Model.Employee;
import com.example.UC3_EmployeePayroll.Model.EmployeeDTO;
import com.example.UC3_EmployeePayroll.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<EmployeeDTO> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.saveEmployee(employeeDTO);
    }
}