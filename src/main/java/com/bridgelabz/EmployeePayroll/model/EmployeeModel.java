package com.bridgelabz.EmployeePayroll.model;

import com.bridgelabz.EmployeePayroll.dto.EmployeeModelDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor

public class EmployeeModel {

    @Id
    @GeneratedValue
    private long id;
    private String employeeName;
    private String gender;
    private String department;
    private long salary;
    private String emailId;
    private LocalDate joiningDate;
    private String profilePic;
    private String note;



    public EmployeeModel(EmployeeModelDTO employeeModelDTO){
        this.employeeName=employeeModelDTO.getEmployeeName();
        this.gender=employeeModelDTO.getGender();
        this.department=employeeModelDTO.getDepartment();
        this.salary=employeeModelDTO.getSalary();
        this.emailId=employeeModelDTO.getEmailId();
        this.joiningDate=employeeModelDTO.getJoiningDate();
        this.profilePic=employeeModelDTO.getProfilePic();
        this.note=employeeModelDTO.getNote();

    }

}
