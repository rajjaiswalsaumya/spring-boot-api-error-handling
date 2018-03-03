package com.example.springboot.api.errorhandling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SampleModel {
    @NotNull(message = "empId cannot be null")
    int empId;
    @Size(max = 10,min = 5)
    @NotNull(message = "name cannot be null")
    String name;
}
