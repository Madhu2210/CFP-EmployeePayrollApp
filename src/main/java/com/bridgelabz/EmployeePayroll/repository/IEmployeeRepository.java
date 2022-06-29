package com.bridgelabz.EmployeePayroll.repository;

import com.bridgelabz.EmployeePayroll.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<EmployeeModel, Long> {
}
