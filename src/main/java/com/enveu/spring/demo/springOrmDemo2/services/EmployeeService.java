package com.enveu.spring.demo.springOrmDemo2.services;

import com.enveu.spring.demo.springOrmDemo2.dto.EmployeeDto;
import com.enveu.spring.demo.springOrmDemo2.entity.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Chaitanya Kumar
 */

public interface EmployeeService {

     List<Employee> getEmp();
//    public ArrayList<EmployeeDto> getEmpDto();

    public ArrayList<EmployeeDto> listDto();
    public Employee addEmp(Employee employee);
    public EmployeeDto convertToDto(Employee employee);
    public List<Employee> getlist();

  public  void deleteEmp(int empId);

    Employee updateEmp(Employee employee, int empId);

    }
