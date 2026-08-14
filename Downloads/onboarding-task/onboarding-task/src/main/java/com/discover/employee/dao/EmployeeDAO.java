package com.discover.employee.dao;

import com.discover.employee.entity.EmployeeEO;

import java.util.Optional;

public interface EmployeeDAO {
    EmployeeEO save(EmployeeEO employee);    Optional<EmployeeEO> findById(Long id);// using Optional because it helps to avoid null pointer exceptions
    // and provides a more expressive way to handle the absence of a value.
}
