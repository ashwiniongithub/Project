package com.example.Controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Services.CustomerService;
import com.example.Entity.Customer;

@RestController
public class CustomerController {
	@Autowired
    private CustomerService cus_ser;

    @GetMapping("/customer")
    public Iterable<Customer> displaycustomer()
    {
        return this.cus_ser.getAll();
    }
    @GetMapping("/customer/{id}")
    public Optional<Customer> displaycustomerbyid(@PathVariable("id") int x)
    {
        return this.cus_ser.getcustomerById(x);
    }
    @PutMapping("/customer/{id}")
    public String updatecustomerbyid(@RequestBody Customer newcust,@PathVariable("id") int x)
    {
        this.cus_ser.customerupdate(newcust,x);
        return "customer udated";
    }
    @DeleteMapping("/customer/{id}")
    public String deleteemployeebyid(@PathVariable("id") int x)
    {
        cus_ser.deletecustomer(x);
        return "customer deleted";
    }
    @PostMapping("/customer")
    public String createemployee(@RequestBody Customer newcust)
    {
        cus_ser.addcust(newcust);
        return "customer added";
    }

}

