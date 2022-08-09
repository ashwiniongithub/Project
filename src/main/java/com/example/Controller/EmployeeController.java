package com.example.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repository.*;
import com.example.Services.EmployeeService;
import com.example.Entity.Employee;
@RestController
public class EmployeeController {
	@Autowired
    private EmployeeService emp_ser;
     @GetMapping("/employee")
        public List<Employee> displaycustomer()
        {
            return (List<Employee>) this.emp_ser.getAll();
        }
        @GetMapping("/employee/{id}")
        public Optional<Employee> displaycustomerbyid(@PathVariable("id") int x)
        {
            return this.emp_ser.getEmployeeById(x);
        }
        @PutMapping("/employee/{id}")
        public String updatecustomerbyid(@RequestBody Employee newemp,@PathVariable("id") int x)
        {
            this.emp_ser.Employeeupdate(newemp, x);
            return "employee udated";
        }
        @DeleteMapping("/employee/{id}")
        public String deleteemployeebyid(@PathVariable("id") int x)
        {
            emp_ser.deleteEmployee(x);
            return "employee deleted";
        }
        @PostMapping("/employee")
        public String createemployee(@RequestBody Employee newemp)
        {
            emp_ser.addemp(newemp);
            return "employee added";
        }

}