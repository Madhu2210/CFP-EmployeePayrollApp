package com.bridgelabz.EmployeePayroll.model;

import com.bridgelabz.EmployeePayroll.dto.EmployeeModelDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
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


    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public EmployeeModel(){
    }

    public EmployeeModel(long id, String employeeName, String gender, String department, long salary, String emailId, LocalDate joiningDate, String profilePic, String note) {
        this.id = id;
        this.employeeName = employeeName;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.emailId = emailId;
        this.joiningDate = joiningDate;
        this.profilePic = profilePic;
        this.note = note;
    }

    public String getEmployeeName() {

        return employeeName;
    }

    public void setEmployeeName(String employeeName) {

        this.employeeName = employeeName;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public long getSalary() {

        return salary;
    }

    public void setSalary(long salary) {

        this.salary = salary;
    }

    public String getEmailId() {

        return emailId;
    }

    public void setEmailId(String emailId) {

        this.emailId = emailId;
    }

    public LocalDate getJoiningDate() {

        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {

        this.joiningDate = joiningDate;
    }

    public String getProfilePic() {

        return profilePic;
    }

    public void setProfilePic(String profilePic) {

        this.profilePic = profilePic;
    }

    public String getNote() {

        return note;
    }

    public void setNote(String note) {

        this.note = note;
    }

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

    @Override
    public String toString(){
        return "Employee{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", salary='" + salary + '\'' +
                ", emailId='" + emailId + '\'' +
                ", joiningDate='" + joiningDate + '\'' +
                ", profilePic='" + profilePic + '\'' +
                ", note='" + note + '\'' +
                '}';
    }


}
