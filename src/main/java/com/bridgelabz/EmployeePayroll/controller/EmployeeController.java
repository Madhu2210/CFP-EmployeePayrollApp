package com.bridgelabz.EmployeePayroll.controller;

import com.bridgelabz.EmployeePayroll.dto.EmployeeModelDTO;
import com.bridgelabz.EmployeePayroll.dto.ResponseDTO;
import com.bridgelabz.EmployeePayroll.model.EmployeeModel;
import com.bridgelabz.EmployeePayroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public ResponseEntity<ResponseDTO> getEmployee(@Valid @RequestBody EmployeeModelDTO employeeModel) {
        String addEmployee = employeeService.AddEmployee(employeeModel);
        ResponseDTO responseDTO=new ResponseDTO("Employee added successfully", addEmployee);
        return new ResponseEntity(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/getEmployee/{getId}")
    public ResponseEntity<ResponseDTO> getEmployee(@PathVariable int getId) {
        EmployeeModel employeeModel = employeeService.getEmployeeDetails(getId);
        ResponseDTO responseDTO=new ResponseDTO("Call for Id successful", employeeModel);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @GetMapping("/getEmployee")
    public ResponseEntity<ResponseDTO> getEmployees()
    {
        List<EmployeeModel> employeeModel = employeeService.getListOfEmployees();
        ResponseDTO responseDTO=new ResponseDTO("Call for employee successful", employeeModel);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDTO> deleteEmployee(@RequestParam int id){
        employeeService.deleteEmployee(id);
        ResponseDTO responseDTO= new ResponseDTO("Employee Deleted Successfully", id);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/updateEmployee/{getId}")
    public ResponseEntity<ResponseDTO> updateEmployee(@PathVariable long getId, @Valid @RequestBody EmployeeModelDTO employeeModelDTO){
    EmployeeModel employeeModel1=employeeService.updateEmployee(getId, employeeModelDTO);
    ResponseDTO responseDTO= new ResponseDTO("Employee Details Updated successfully", employeeModel1);
    return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

}
