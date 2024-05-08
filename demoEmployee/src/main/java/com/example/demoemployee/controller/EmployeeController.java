package com.example.demoemployee.controller;

import com.example.demoemployee.model.Employee;
import com.example.demoemployee.repository.EmployeeRepository;
import com.example.demoemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String test() {
        return "Hello, world";
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
        // Kiểm tra xem Employee có tồn tại không trước khi cập nhật
        Employee existingEmployee = employeeService.getOneEmployee(id);
        if (existingEmployee == null) {
            // Xử lý khi không tìm thấy Employee với id cụ thể
            // Ví dụ: throw một ngoại lệ hoặc trả về thông báo lỗi
        }

        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteEmployee(@PathVariable("id") int id) {
        // Kiểm tra xem Employee có tồn tại không trước khi xóa
        Employee existingEmployee = employeeService.getOneEmployee(id);
        if (existingEmployee == null) {
            // Xử lý khi không tìm thấy Employee với id cụ thể
            // Ví dụ: throw một ngoại lệ hoặc trả về thông báo lỗi
        }

        return employeeService.deleteEmployee(id);
    }

    @GetMapping("/list")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/get-one-employee/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {
        return employeeService.getOneEmployee(id);
    }
}
