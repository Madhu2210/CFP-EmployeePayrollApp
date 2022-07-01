    package com.bridgelabz.EmployeePayroll.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@ToString
public class EmployeeModelDTO {
    @Pattern(regexp= "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name invalid")
    private String employeeName;
    @Pattern(regexp = "male|female", message = "Gender needs to be either male or female")
    private String gender;
    @Pattern(regexp= "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Department should not be null")
    private String department;
    @Min(value = 12000, message = "minimum salary should be more that 12000")
    private long salary;
    @Email
    private String emailId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotNull (message="start date should not be empty")
    private LocalDate joiningDate;

    private String profilePic;
    @NotBlank(message = "Note cannot be blank")
    private String note;

}
