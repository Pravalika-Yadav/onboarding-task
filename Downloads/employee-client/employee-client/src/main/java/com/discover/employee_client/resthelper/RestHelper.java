package com.discover.employee_client.resthelper;

import com.discover.employee_client.vo.EmployeeResponseVO;

public interface RestHelper {

    public EmployeeResponseVO getEmployee(Long id);
}
