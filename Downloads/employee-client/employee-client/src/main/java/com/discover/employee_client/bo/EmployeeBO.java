package com.discover.employee_client.bo;

import com.discover.employee_client.vo.EmployeeResponseVO;

public interface EmployeeBO {

    public EmployeeResponseVO getEmployeeUsingRest(Long id);

     public EmployeeResponseVO getEmployeeUsingFeign(Long id);
}
