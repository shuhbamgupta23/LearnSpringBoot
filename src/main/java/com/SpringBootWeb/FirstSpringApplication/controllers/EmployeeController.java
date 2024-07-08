package com.SpringBootWeb.FirstSpringApplication.controllers;

import com.SpringBootWeb.FirstSpringApplication.dto.EmployeeDTO;
import com.SpringBootWeb.FirstSpringApplication.exceptions.ResourceNotFoundException;
import com.SpringBootWeb.FirstSpringApplication.services.EmployeeService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping("/{employeeID}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long employeeID){
        Optional<EmployeeDTO> employeeDTO = employeeService.getEmployeeById(employeeID);
      return employeeDTO
              .map(employeeDTO1 -> ResponseEntity.ok(employeeDTO1))
              .orElseThrow(()-> new ResourceNotFoundException("Employee not found with id: "+employeeID));
    }


    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployee(@RequestParam(required = false) Integer age, @RequestParam(required = false) String name){
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody @Valid EmployeeDTO inputEmployee){
        EmployeeDTO savedEmployee = employeeService.createEmployee(inputEmployee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/{employeeId}")
    public ResponseEntity<EmployeeDTO> updateEmployeeById(@RequestBody EmployeeDTO inputEmployee,@PathVariable Long employeeId){
        return ResponseEntity.ok(employeeService.updateEmployeeById(employeeId, inputEmployee));
    }

    @DeleteMapping("/{employeeId}")
    public void deleteEmployeeById(@PathVariable Long employeeId){
         employeeService.deleteEmployeeById(employeeId);
    }
}
