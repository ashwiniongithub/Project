package com.example.Services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.Repository.CustomerRepository;
import com.example.Entity.Customer;

@Configuration
public class CustomerService {
	@Autowired
    private CustomerRepository cus_rep;

    public Iterable<Customer> getAll() 
    {
      return  cus_rep.findAll();
    }
    public Optional<Customer> getcustomerById(int a)
    {
        Optional<Customer> c1=null;
        c1=cus_rep.findById(a);
        return c1;
    }
    public void customerupdate(Customer c, int a)
    {
        Optional<Customer> c1=null;
        c1=cus_rep.findById(a);
        c1.ifPresent(y->cus_rep.save(c));
    }
    public void deletecustomer(int a)
    {
        cus_rep.deleteById(a);

    }
    public void addcust(Customer c)
    {
        cus_rep.save(c);

    }

}