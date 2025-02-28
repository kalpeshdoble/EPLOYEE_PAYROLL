package com.example.UC3_EmployeePayroll.Repository;

import com.example.UC3_EmployeePayroll.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}