package com.bridgelabz.EmployeePayroll.service;

import com.bridgelabz.EmployeePayroll.model.EmployeeModel;
import com.bridgelabz.EmployeePayroll.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    IEmployeeRepository repository;

    @Override
    public String getMessage() {

        return "This is Employee payroll service";
    }

    @Override
    public String AddEmployee(EmployeeModel employeeModel) {
        repository.save(employeeModel);
        return employeeModel.toString();
    }

    @Override
    public List<EmployeeModel> getListOfEmployees() {
        List<EmployeeModel> employeeModels = repository.findAll();
        return employeeModels;
    }

    @Override
    public EmployeeModel getEmployeeDetails(int getId) {
        Optional<EmployeeModel> employeeModel = repository.findById((long) getId);
        return employeeModel.get();
    }

    @Override
    public EmployeeModel deleteEmployee(int id) {
        repository.deleteById((long) id);
        return null;
    }

    @Override
    public EmployeeModel updateEmployee(long getId, EmployeeModel employeeModel) {
        Optional<EmployeeModel> employeeModel1 = repository.findById(getId);
        if (employeeModel1.isPresent()) {
            employeeModel1.get().setEmployeeName(employeeModel.getEmployeeName());
            employeeModel1.get().setGender(employeeModel.getGender());
            employeeModel1.get().setDepartment(employeeModel.getDepartment());
            employeeModel1.get().setJoiningDate(employeeModel.getJoiningDate());
            employeeModel1.get().setSalary(employeeModel.getSalary());
            employeeModel1.get().setEmailId(employeeModel.getEmailId());
            employeeModel1.get().setJoiningDate(employeeModel.getJoiningDate());
            employeeModel1.get().setProfilePic(employeeModel.getProfilePic());
            employeeModel1.get().setNote(employeeModel.getNote());
            repository.save(employeeModel1.get());
            return employeeModel1.get();
        } else {
            return null;
        }
    }

}