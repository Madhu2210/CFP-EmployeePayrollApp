package com.bridgelabz.EmployeePayroll.service;

import com.bridgelabz.EmployeePayroll.dto.EmployeeModelDTO;
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
    public String AddEmployee(EmployeeModelDTO employeeModelDTO) {
        EmployeeModel employeeModel=new EmployeeModel(employeeModelDTO);
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
    public EmployeeModel updateEmployee(long getId, EmployeeModelDTO employeeModelDTO) {
        Optional<EmployeeModel> employeeModel1 = repository.findById(getId);
        if (employeeModel1.isPresent()) {
            employeeModel1.get().setEmployeeName(employeeModelDTO.getEmployeeName());
            employeeModel1.get().setGender(employeeModelDTO.getGender());
            employeeModel1.get().setDepartment(employeeModelDTO.getDepartment());
            employeeModel1.get().setJoiningDate(employeeModelDTO.getJoiningDate());
            employeeModel1.get().setSalary(employeeModelDTO.getSalary());
            employeeModel1.get().setEmailId(employeeModelDTO.getEmailId());
            employeeModel1.get().setJoiningDate(employeeModelDTO.getJoiningDate());
            employeeModel1.get().setProfilePic(employeeModelDTO.getProfilePic());
            employeeModel1.get().setNote(employeeModelDTO.getNote());
            repository.save(employeeModel1.get());
            return employeeModel1.get();
        } else {
            return null;
        }
    }

    @Override
    public List<EmployeeModel> getEmployeesByDepartment(String department) {
        return repository.findEmployeeByDepartment(department);
    }

}