package com.bridgelabz.EmployeePayroll.controller;

import com.bridgelabz.EmployeePayroll.model.EmployeeModel;
import com.bridgelabz.EmployeePayroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeePayrollService")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/home")
    public String home() {
        String message = employeeService.getMessage();
        return message;
    }

    @PostMapping("/AddEmployee")
    public String getEmployee(@RequestBody EmployeeModel employeeModel) {
        String addEmployee = employeeService.AddEmployee(employeeModel);
        return addEmployee;
    }

    @GetMapping("/getEmployee")
    public List<EmployeeModel> getEmployees() {
        List<EmployeeModel> employeeModels = employeeService.getListOfEmployees();
        return employeeModels;
    }

    @GetMapping("/getEmployee/{getId}")
    public EmployeeModel getEmployee(@PathVariable int getId) {
        EmployeeModel employeeModel = employeeService.getEmployeeDetails(getId);
        return employeeModel;
    }

    @DeleteMapping("/delete")
    public String deleteEmployee(@RequestParam int id){
        EmployeeModel employeeModel=employeeService.deleteEmployee(id);
        return "deleted.....!";
    }

    @PutMapping("/updateEmployee/{getId}")
    public EmployeeModel updateEmployee(@PathVariable long getId, @RequestBody EmployeeModel employeeModel){
    EmployeeModel employeeModel1=employeeService.updateEmployee(getId, employeeModel);
    return employeeModel1;
    }

}
