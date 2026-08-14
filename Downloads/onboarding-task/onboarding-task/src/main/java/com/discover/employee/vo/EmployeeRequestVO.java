package com.discover.employee.vo;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequestVO {
    @NotBlank(message = "Name cannot be blank")
    private String name;
   @Min(value = 18, message = "Age must be at least 18")
   @Max(value = 60, message = "Age must be at most 60")
    private Integer age;

}
