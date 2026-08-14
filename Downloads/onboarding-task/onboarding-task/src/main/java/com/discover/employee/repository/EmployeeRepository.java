package com.discover.employee.repository;

import com.discover.employee.entity.EmployeeEO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEO, Long> {
}
