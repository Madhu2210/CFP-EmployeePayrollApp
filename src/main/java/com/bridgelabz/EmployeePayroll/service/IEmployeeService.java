package com.bridgelabz.EmployeePayroll.service;

import com.bridgelabz.EmployeePayroll.model.EmployeeModel;

import java.util.List;

public interface IEmployeeService {

    public String getMessage();
    String AddEmployee(EmployeeModel employeeModel);

    List<EmployeeModel> getListOfEmployees();

    EmployeeModel getEmployeeDetails(int getId);

    EmployeeModel deleteEmployee(int id);

    EmployeeModel updateEmployee(long getId, EmployeeModel employeeModel);
}
