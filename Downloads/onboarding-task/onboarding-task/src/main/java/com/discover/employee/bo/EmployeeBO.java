package com.discover.employee.bo;

import com.discover.employee.entity.EmployeeEO;

public interface EmployeeBO {

    EmployeeEO createEmployee(EmployeeEO employee);
    EmployeeEO getEmployee(Long id);
}
