package com.example.demoemployee.service;

import com.example.demoemployee.model.Employee;
import com.example.demoemployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImplement implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        if (employee != null) {
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        if (employee != null) {
            Employee employee1 = employeeRepository.getById(id);
            if (employee1 != null) {
                employee1.setName(employee.getName());
                employee1.setAddress(employee.getAddress());

                return employeeRepository.save(employee1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(int id) {
        if (id >= 1) {
            Employee employee = employeeRepository.getById(id);
            if (employee != null) {
                employeeRepository.delete(employee);
            }
            return true;
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getOneEmployee(int id) {
        System.out.println(id);
        return employeeRepository.getById(id);
    }

}
