package com.SpringBootWeb.demo.repositories;

import com.SpringBootWeb.demo.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
      Optional<EmployeeEntity> findById(Long id);
}
