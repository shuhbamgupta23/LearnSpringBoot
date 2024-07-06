package com.SpringBootWeb.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private  Long id;
    private  String name;
    private  String email;
    private  Integer age;
    private  Boolean isActive;

}
