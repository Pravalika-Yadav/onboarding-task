package com.discover.employee_client.bo;

import com.discover.employee_client.client.EmployeeFeignClient;
import com.discover.employee_client.resthelper.RestHelper;
import com.discover.employee_client.vo.EmployeeResponseVO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeBOImpl implements EmployeeBO{

    private static final Logger LOGGER =
            LoggerFactory.getLogger(EmployeeBOImpl.class);

    private final RestHelper restHelper;
    private final EmployeeFeignClient employeeFeignClient;


    @Override
    public EmployeeResponseVO getEmployeeUsingRest(Long id) {
        LOGGER.info("Fetching employee using RestTemplate for id {}", id);
        return restHelper.getEmployee(id);
    }

    @Override
    public EmployeeResponseVO getEmployeeUsingFeign(Long id) {
        LOGGER.info("Fetching employee using Feign Client for id {}", id);
        return employeeFeignClient.getEmployee(id);
    }
}
