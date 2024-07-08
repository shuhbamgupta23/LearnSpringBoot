package com.SpringBootWeb.FirstSpringApplication.controllers;

import com.SpringBootWeb.FirstSpringApplication.dto.DepartmentDTO;
import com.SpringBootWeb.FirstSpringApplication.services.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/department")
public class DepartmentController {
    private DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<DepartmentDTO>> getAllDepartment() {
        return ResponseEntity.ok(departmentService.getAllDepartment());
    }

//    @GetMapping("/{dptId}")
//    public ResponseEntity<>


}