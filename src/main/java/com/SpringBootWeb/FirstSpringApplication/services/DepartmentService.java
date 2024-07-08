package com.SpringBootWeb.FirstSpringApplication.services;


import com.SpringBootWeb.FirstSpringApplication.dto.DepartmentDTO;
import com.SpringBootWeb.FirstSpringApplication.entities.DepartmentEntity;
import com.SpringBootWeb.FirstSpringApplication.repositories.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final ModelMapper modelMapper;

    public List<DepartmentDTO> getAllDepartment() {
        List<DepartmentEntity> allDepartment = departmentRepository.findAll();
        return allDepartment
                .stream()
                .map(e -> modelMapper.map(e, DepartmentDTO.class))
                .collect(Collectors.toList());
    }

}
