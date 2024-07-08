package com.SpringBootWeb.FirstSpringApplication.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

public class DepartmentDTO {
    private Long id;

    @NotBlank(message = "Name of the department cannot be blank")
    @Size(min = 3, max = 10, message = "Number of characters in name should be in the range: [3, 10]")
    private String name;

    @NotNull(message = "DepartmentCode cannot be blank")
    private LocalDateTime createdAt;

    @AssertTrue(message = "Department should be active")
    @JsonProperty("isActive")
    private Boolean isActive;
}
