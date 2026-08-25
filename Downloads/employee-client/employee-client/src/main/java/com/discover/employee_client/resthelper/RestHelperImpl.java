package com.discover.employee_client.resthelper;

import com.discover.employee_client.vo.EmployeeResponseVO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class RestHelperImpl implements RestHelper {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(RestHelperImpl.class);

    private final RestTemplate restTemplate;

    @Value("${employee.url}")
    //@value injects a value from properties files
    private String employeeUrl;

    @Override
    public EmployeeResponseVO getEmployee(Long id) {

        LOGGER.info("Calling Employee Service using RestTemplate for id {}", id);

        return restTemplate.getForObject(employeeUrl + id,
                EmployeeResponseVO.class
        );
    }
}