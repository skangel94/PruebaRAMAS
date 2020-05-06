package com.utn.spring.model;

import com.utn.spring.interfaces.IGetSalaryEmployer;

public class GetSalaryfForEmployerImp implements IGetSalaryEmployer {

    @Override
    public Integer getSalary() {
        return new Integer(100000);
    }
}
