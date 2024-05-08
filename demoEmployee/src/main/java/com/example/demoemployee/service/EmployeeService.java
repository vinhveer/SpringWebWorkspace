package com.example.demoemployee.service;

import com.example.demoemployee.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);

    public Employee updateEmployee(int id, Employee employee);

    public boolean deleteEmployee(int id);

    public List<Employee> getAllEmployee();

    public Employee getOneEmployee(int id);

}
