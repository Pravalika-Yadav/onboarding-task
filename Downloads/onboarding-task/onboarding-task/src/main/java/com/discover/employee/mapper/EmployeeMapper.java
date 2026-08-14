package com.discover.employee.mapper;

import com.discover.employee.entity.EmployeeEO;
import com.discover.employee.vo.EmployeeRequestVO;
import com.discover.employee.vo.EmployeeResponseVO;
import org.mapstruct.Mapper;

@Mapper(componentModel ="spring")
public interface EmployeeMapper {
    EmployeeEO requestVoToEo(EmployeeRequestVO employeerequestVO);

    EmployeeResponseVO eoToResponseVo(EmployeeEO employeeEO);

}
