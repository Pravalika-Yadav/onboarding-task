package com.discover.employee.dao;

import com.discover.employee.entity.EmployeeEO;
import com.discover.employee.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(EmployeeDAOImpl.class);

    private final EmployeeRepository employeeRepository;


    public EmployeeDAOImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeEO save(EmployeeEO employee) {
        LOGGER.info("Saving employee to database");
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<EmployeeEO> findById(Long id) {
        LOGGER.info("Finding employee by id: {}", id);

        return employeeRepository.findById(id);
    }
}
