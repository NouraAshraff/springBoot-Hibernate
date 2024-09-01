package com.example.spring_hibernate.controller;

import com.example.spring_hibernate.model.Employee;
import com.example.spring_hibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> get() {
        return employeeService.get();
    }

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @GetMapping("employee/{id}")
    public Employee get(@PathVariable("id") Integer id) {
        Employee employee = employeeService.get(id);
        if (employee == null) {
            throw  new RuntimeException("The Employee with id : " + id + " is not found");
        }
        return employee;
    }

    @DeleteMapping("employee/{id}")
    public void delete(@PathVariable("id") Integer id) {
         employeeService.delete(id);
    }
    @PutMapping("employee")
    public Employee update( @RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }
}
