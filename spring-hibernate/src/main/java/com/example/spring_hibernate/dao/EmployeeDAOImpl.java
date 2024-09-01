package com.example.spring_hibernate.dao;

import com.example.spring_hibernate.model.Employee;
import jakarta.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Employee> query = currentSession.createQuery("from Employee" , Employee.class);
        List<Employee> employees = query.list();
        return employees;
    }

    @Override
    public Employee get(int id) {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void delete(int id) {

    }
}
