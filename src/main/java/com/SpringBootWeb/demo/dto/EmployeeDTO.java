package com.SpringBootWeb.demo.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
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
    @NotNull(message = "Name cannot be null")
    private  String name;
    @Email(message="Email format incorrect")
    private  String email;
    private  Integer age;
    private  Boolean isActive;

}
