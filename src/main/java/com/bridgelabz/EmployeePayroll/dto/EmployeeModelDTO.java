package com.bridgelabz.EmployeePayroll.dto;

import java.time.LocalDate;

public class EmployeeModelDTO {

    private String employeeName;
    private String gender;
    private String department;
    private long salary;
    private String emailId;
    private LocalDate joiningDate;
    private String profilePic;
    private String note;

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

    public EmployeeModelDTO(String employeeName, String gender, String department, long salary, String emailId, LocalDate joiningDate, String profilePic, String note) {
        this.employeeName = employeeName;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.emailId = emailId;
        this.joiningDate = joiningDate;
        this.profilePic = profilePic;
        this.note = note;
    }

    public EmployeeModelDTO() {
    }

}
