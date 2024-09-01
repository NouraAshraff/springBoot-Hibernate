package com.example.spring_hibernate.dao;

import com.example.spring_hibernate.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> get();
    Employee get(int id);
    void save(Employee employee);
    void delete(int id);
}
