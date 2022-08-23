package com.enveu.spring.demo.springOrmDemo2.services;

import com.enveu.spring.demo.springOrmDemo2.dto.EmployeeDto;
import com.enveu.spring.demo.springOrmDemo2.entity.Employee;
import com.enveu.spring.demo.springOrmDemo2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Chaitanya Kumar
 */
@Service

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    //     List<Employee> list = new ArrayList<>();
    ArrayList<EmployeeDto> dto = new ArrayList<>();

    @Override
    public List<Employee> getEmp() {
        return employeeRepository.findAll();
    }
//
//    @Override
//    public ArrayList<EmployeeDto> getEmpDto() {
//        dtolist.removeAll(dtolist);
//        for(
//                Employee e:list)
//        {
//            dto.add(employeeToDto(e));
//        }
//        return this.dto;
//    }


    @Override
    public Employee addEmp(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getlist() {
        return employeeRepository.findAll();
    }

    @Override
    public ArrayList<EmployeeDto> listDto() {
        dto.removeAll(dto);
        for (
                Employee e : getlist()) {
            dto.add(convertToDto(e));
        }
        return this.dto;
    }

    @Override
    public void deleteEmp(int empId) {
//        Employee employee1 = employeeRepository.findAllById(empId).get();
        employeeRepository.deleteById(empId);

        return ;
}

    @Override
    public Employee updateEmp(Employee employee, int empId) {

        Employee employee1=employeeRepository.findById(empId).get();

                employee1.setId(employee1.getId());
                employee1.setName(employee.getName());
                employee1.setDepartment(employee.getDepartment());
                employee1.setSalary(employee.getSalary());

           return employeeRepository.save(employee1);

    }
    public EmployeeDto convertToDto(Employee employee)
    {
        EmployeeDto employeeDto1 = new EmployeeDto();
        employeeDto1.setId(employee.getId());
        employeeDto1.setName(employee.getName());
        employeeDto1.setDepartment(employee.getDepartment());
        return employeeDto1;
    }


}
