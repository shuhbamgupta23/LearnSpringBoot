package com.SpringBootWeb.FirstSpringApplication.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private  String name;
    private  String email;
    private  Integer age;
    private  Boolean isActive;
}
