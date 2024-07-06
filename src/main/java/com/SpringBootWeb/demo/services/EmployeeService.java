package com.SpringBootWeb.demo.services;

import com.SpringBootWeb.demo.configs.MapperConfig;
import com.SpringBootWeb.demo.dto.EmployeeDTO;
import com.SpringBootWeb.demo.entities.EmployeeEntity;
import com.SpringBootWeb.demo.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeDTO getEmployeeById(Long id){
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);
        return modelMapper.map(employeeEntity, EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployees(){
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
       return employeeEntities
                .stream()
                .map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDTO.class))
                .collect(Collectors.toList());
    }


    public EmployeeDTO createEmployee(EmployeeEntity employee){
        EmployeeEntity toSaveEntity = employeeRepository.save(employee);
        return modelMapper.map(toSaveEntity,EmployeeDTO.class);
    }

}
