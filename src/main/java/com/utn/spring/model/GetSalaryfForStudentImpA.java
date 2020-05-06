package com.utn.spring.model;

import com.utn.spring.interfaces.IGetSalaryStudent;

public class GetSalaryfForStudentImpA implements IGetSalaryStudent {

    @Override
    public Integer getSalary() {
        return new Integer(10);
    }
}
