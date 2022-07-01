package com.bridgelabz.EmployeePayroll.model;

import com.bridgelabz.EmployeePayroll.dto.EmployeeModelDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString
@Table(name="employee_model")
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name= "id")
    private long id;
    @Column(name = "employee_name")
    private String employeeName;
    private String gender;
    private String department;
    private long salary;
    private String emailId;
    private LocalDate joiningDate;
    private String profilePic;
    private String note;

    @ElementCollection
    @CollectionTable(name="employee_department", joinColumns = @JoinColumn(name="id"))
    @Column(name= "department")
    private List<String> departments;


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
