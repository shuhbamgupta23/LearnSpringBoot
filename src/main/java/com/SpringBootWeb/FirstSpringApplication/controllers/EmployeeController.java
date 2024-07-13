package com.SpringBootWeb.FirstSpringApplication.controllers;

import com.SpringBootWeb.FirstSpringApplication.entities.EmployeeEntity;
import com.SpringBootWeb.FirstSpringApplication.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private  EmployeeService employeeService;

    @GetMapping("/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return employeeService.createNewEmployee(employeeEntity);
    }
}
