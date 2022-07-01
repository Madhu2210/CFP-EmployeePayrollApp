package com.bridgelabz.EmployeePayroll.repository;

import com.bridgelabz.EmployeePayroll.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IEmployeeRepository extends JpaRepository<EmployeeModel, Long> {
    @Query(value = "select * from employeepayroll, employee_department where id = id and department = :department",nativeQuery = true)
    List<EmployeeModel> findEmployeeByDepartment(String department);
}
