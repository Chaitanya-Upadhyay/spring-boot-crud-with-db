package com.enveu.spring.demo.springOrmDemo2.repository;

import com.enveu.spring.demo.springOrmDemo2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
