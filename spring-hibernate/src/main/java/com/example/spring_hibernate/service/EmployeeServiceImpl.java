package com.example.spring_hibernate.service;

import com.example.spring_hibernate.dao.EmployeeDAO;
import com.example.spring_hibernate.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    @Autowired
    private EmployeeDAO employeeDOA;

    @Transactional
    @Override
    public List<Employee> get() {
        return employeeDOA.get();
    }

    @Transactional
    @Override
    public Employee get(int id) {
        return null;
    }

    @Transactional
    @Override
    public void save(Employee employee) {

    }

    @Transactional
    @Override
    public void delete(int id) {

    }
}
