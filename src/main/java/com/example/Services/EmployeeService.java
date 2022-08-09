package com.example.Services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Repository.CustomerRepository;
import com.example.Repository.EmployeeRepository;
import com.example.Entity.Customer;
import com.example.Entity.Employee;
@Configuration
public class EmployeeService {
	@Autowired
    private EmployeeRepository emp_rep;

    public Iterable<Employee> getAll() 
    {
		return  emp_rep.findAll();
    }
    public Optional<Employee> getEmployeeById(long a)
    {
        Optional<Employee> c1=null;
        c1=emp_rep.findById(a);
        return c1;
    }
    public void Employeeupdate(Employee c, long a)
    {
        Optional<Employee> c1=null;
       c1=emp_rep.findById(a);
        c1.ifPresent(y->emp_rep.save(c));
    }
    public void deleteEmployee(long a)
    {
        emp_rep.deleteById(a);

    }
    public void addemp(Employee c)
    {
        emp_rep.save(c);

    }
}
