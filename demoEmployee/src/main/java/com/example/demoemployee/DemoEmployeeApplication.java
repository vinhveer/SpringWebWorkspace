package com.example.demoemployee;

import com.example.demoemployee.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class DemoEmployeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEmployeeApplication.class, args);
    }

}
