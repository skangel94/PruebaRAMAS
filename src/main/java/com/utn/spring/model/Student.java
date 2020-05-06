package com.utn.spring.model;

import com.utn.spring.interfaces.IGetSalaryStudent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student extends Person {

    IGetSalaryStudent iGetSalaryStudent;

    public Integer getSalary(){
        return iGetSalaryStudent.getSalary();
    }

    public void setiGetSalaryStudent(IGetSalaryStudent iGetSalaryStudent) {
        this.iGetSalaryStudent = iGetSalaryStudent;
    }
}
