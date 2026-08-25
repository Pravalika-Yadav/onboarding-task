package com.discover.employee_client.mapper;


import com.discover.employee_client.eo.EmployeeEO;
import com.discover.employee_client.vo.EmployeeResponseVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface EmployeeMapper {


    EmployeeResponseVO eoToVo(EmployeeEO employeeEO);
    EmployeeEO voToEo(EmployeeResponseVO employeeResponseVO);
}