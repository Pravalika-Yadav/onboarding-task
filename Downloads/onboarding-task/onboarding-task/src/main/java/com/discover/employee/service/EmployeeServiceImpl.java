package com.discover.employee.service;

import com.discover.employee.bo.EmployeeBO;
import com.discover.employee.entity.EmployeeEO;
import com.discover.employee.mapper.EmployeeMapper;
import com.discover.employee.vo.EmployeeRequestVO;
import com.discover.employee.vo.EmployeeResponseVO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(EmployeeServiceImpl.class);

    private final EmployeeBO employeeBO;
    private final EmployeeMapper employeeMapper;


    @Override
    public EmployeeResponseVO createEmployee(EmployeeRequestVO employeeRequestVO) {
        LOGGER.info("Creating employee in service layer");
        EmployeeEO employeeEO =employeeMapper.requestVoToEo(employeeRequestVO);
        EmployeeEO savedEmployee = employeeBO.createEmployee(employeeEO);

        return employeeMapper.eoToResponseVo(savedEmployee);
    }

    @Override
    public EmployeeResponseVO getEmployee(Long id) {

        LOGGER.info("Fetching employee with id {}", id);

        EmployeeEO employeeEO = employeeBO.getEmployee(id);

        return employeeMapper.eoToResponseVo(employeeEO);
    }
}
