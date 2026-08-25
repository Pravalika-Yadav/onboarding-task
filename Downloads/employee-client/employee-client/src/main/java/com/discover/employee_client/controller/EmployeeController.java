package com.discover.employee_client.controller;

import com.discover.employee_client.service.EmployeeService;
import com.discover.employee_client.vo.EmployeeResponseVO;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
@Validated
public class EmployeeController {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(EmployeeController.class);

    private final EmployeeService employeeService;


    @GetMapping("/rest/{id}")
    public EmployeeResponseVO getEmployeeUsingRest(
            @PathVariable
            @NotNull
            @Min(1)
            @Max(999999)
            Long id){
        LOGGER.info("Received request to fetch employee using RestTemplate for id {}", id);
        return employeeService.getEmployeeUsingRest(id);
    }
    @GetMapping("/feign/{id}")
    public EmployeeResponseVO getEmployeeUsingFeign(
            @PathVariable
            @NotNull
            @Min(1)
            @Max(999999)
            Long id) {
        LOGGER.info("Received request to fetch employee using Feign Client for id {}", id);
        return employeeService.getEmployeeUsingFeign(id);
    }

}
