package com.discover.employee_client.client;


import com.discover.employee_client.vo.EmployeeResponseVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "employeeClient",
        url = "http://localhost:8080"
)
public interface EmployeeFeignClient {
    @GetMapping("/employees/{id}")
    EmployeeResponseVO getEmployee(
@PathVariable("id") Long id);
}
