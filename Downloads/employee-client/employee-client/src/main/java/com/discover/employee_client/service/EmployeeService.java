package com.discover.employee_client.service;

import com.discover.employee_client.vo.EmployeeResponseVO;

public interface EmployeeService {

    public EmployeeResponseVO getEmployeeUsingRest(Long id);
    public EmployeeResponseVO getEmployeeUsingFeign(Long id);
}
