package com.discover.employee.bo;

import com.discover.employee.constants.Constants;
import com.discover.employee.dao.EmployeeDAO;
import com.discover.employee.entity.EmployeeEO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeBOImpl implements EmployeeBO {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeBOImpl.class);

    private final EmployeeDAO employeeDAO;

    @Override
    public EmployeeEO createEmployee(EmployeeEO employee) {
        LOGGER.info("Creating employee");

        return employeeDAO.save(employee);
    }

    @Override
    public EmployeeEO getEmployee(Long id) {
        LOGGER.info("Retrieving employee with id {}", id);

        return employeeDAO.findById(id)
                .orElseThrow(() -> new RuntimeException(Constants.EMPLOYEE_NOT_FOUND + ": " + id));
    }
}
