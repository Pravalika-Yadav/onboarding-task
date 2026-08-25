package com.discover.employee_client.service;

import com.discover.employee_client.bo.EmployeeBO;
import com.discover.employee_client.vo.EmployeeResponseVO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private static final Logger LOGGER =
            LoggerFactory.getLogger(EmployeeServiceImpl.class);

    private final EmployeeBO employeeBo;
    @Override
    public EmployeeResponseVO getEmployeeUsingRest(Long id) {
        LOGGER.info("Fetching employee using RestTemplate for id {}", id);
        return employeeBo.getEmployeeUsingRest(id);
    }

    @Override
    public EmployeeResponseVO getEmployeeUsingFeign(Long id) {
        LOGGER.info("Fetching employee using Feign Client for id {}", id);
        return employeeBo.getEmployeeUsingFeign(id);
    }
}
