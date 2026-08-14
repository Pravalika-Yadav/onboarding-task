package com.discover.employee.controller;

import com.discover.employee.constants.Constants;
import com.discover.employee.service.EmployeeService;
import com.discover.employee.vo.EmployeeRequestVO;
import com.discover.employee.vo.EmployeeResponseVO;
import com.discover.employee.vo.HealthResponseVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
@Validated
public class EmployeeController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(EmployeeController.class);

    private final EmployeeService employeeService;

    @PostMapping("/create")
    public EmployeeResponseVO createEmployee(
            @Valid @RequestBody EmployeeRequestVO employeeRequestVO) {

        LOGGER.info("Create Employee API called");

        return employeeService.createEmployee(employeeRequestVO);
    }

    @GetMapping("/{id}")
    public EmployeeResponseVO getEmployee(
            @PathVariable
            @NotNull(message = "Id cannot be null")
            @Min(value = 1, message = "Id must be greater than 0")
            @Max(value = 999999, message = "Id exceeded maximum limit")
            Long id) {

        LOGGER.info("Get Employee API called with id {}", id);

        return employeeService.getEmployee(id);
    }

    @GetMapping("/health")
    public HealthResponseVO healthCheck() {

        LOGGER.info("Health Check API called");

        HealthResponseVO healthResponseVO = new HealthResponseVO();
        healthResponseVO.setStatus(Constants.APP_UP);
        healthResponseVO.setDatabase(Constants.DB_CONNECTED);

        return healthResponseVO;
    }
}