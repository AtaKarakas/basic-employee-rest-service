package com.atakarakas.employeerestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@EnableJpaRepositories("com.atakarakas.employeerestservice.api.repository")
@EntityScan("com.atakarakas.employeerestservice.api.repository.domain")
public class EmployeeRestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeRestServiceApplication.class, args);
    }


}
