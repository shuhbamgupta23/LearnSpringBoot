package com.SpringBootWeb.demo.controllers;

import com.SpringBootWeb.demo.dto.EmployeeDTO;
import com.SpringBootWeb.demo.entities.EmployeeEntity;
import com.SpringBootWeb.demo.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping("/{employeeID}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeID){
        return employeeService.getEmployeeById(employeeID);
    }

    @GetMapping
    public List<EmployeeEntity> getAllEmployee(@RequestParam(required = false) Integer age, @RequestParam(required = false) String name){
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employee){
        return employeeService.createEmployee(employee);
    }
}
