package com.enveu.spring.demo.springOrmDemo2.controller;

import com.enveu.spring.demo.springOrmDemo2.dto.EmployeeDto;
import com.enveu.spring.demo.springOrmDemo2.entity.Employee;
import com.enveu.spring.demo.springOrmDemo2.services.EmployeeService;
import com.enveu.spring.demo.springOrmDemo2.services.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/welcome")
    public String hello()
    {
        return "This is SpringBoot with ORM";
    }


    @PostMapping("/add")
    public String addNewUser (@RequestBody Employee employee) {
        employeeService.addEmp(employee);
        return "Saved";
    }

//    @GetMapping("/list")
//    public List<Employee> getEmplist()
//    {
//        return employeeService.getlist();
//    }

    @GetMapping("/dtoList")
    public ArrayList<EmployeeDto> getdtolist()
    {
        return employeeService.listDto();
    }

    @PutMapping("/update/{empId}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("empId") int empId)
    {
//      return employeeService.updateEmp(employee,empId);
        this.employeeService.updateEmp(employee,empId);
        return employee;
    }
//    @GetMapping("/get")
//    public List<Employee> getemp()
//    {
//       return employeeService.getEmp();
//    }

    @DeleteMapping("/list/{empId}")
    public void deleteEmployee(@PathVariable("empId")int empId)
    {
        employeeService.deleteEmp(empId);
        return;
    }
}
