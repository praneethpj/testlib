package com.testlibrary.demo.controller;

import com.praneethpj.employee.demo.model.Employee;
public class Authcontroller {

Employee employee =new Employee();

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
