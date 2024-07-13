package com.SpringBootWeb.FirstSpringApplication.repositories;

import com.SpringBootWeb.FirstSpringApplication.entities.DepartmentEntity;
import com.SpringBootWeb.FirstSpringApplication.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
    DepartmentEntity findByManager(EmployeeEntity employeeEntity);
}
