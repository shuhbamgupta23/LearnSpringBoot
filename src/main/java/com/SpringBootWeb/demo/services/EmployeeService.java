package com.SpringBootWeb.demo.services;

import com.SpringBootWeb.demo.dto.EmployeeDTO;
import com.SpringBootWeb.demo.entities.EmployeeEntity;
import com.SpringBootWeb.demo.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeDTO getEmployeeById(Long id){
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);
        ModelMapper mapper = new ModelMapper();
        return mapper.map(employeeEntity, EmployeeDTO.class);
    }

    public List<EmployeeEntity> getAllEmployees(){
        return employeeRepository.findAll();
    }


    public EmployeeEntity createEmployee(EmployeeEntity employee){
        return employeeRepository.save(employee);
    }

}
