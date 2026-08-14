package com.discover.employee.service;

import com.discover.employee.vo.EmployeeRequestVO;
import com.discover.employee.vo.EmployeeResponseVO;

public interface EmployeeService {

    EmployeeResponseVO createEmployee(EmployeeRequestVO employeeRequestVO);

    EmployeeResponseVO getEmployee(Long id);
}
