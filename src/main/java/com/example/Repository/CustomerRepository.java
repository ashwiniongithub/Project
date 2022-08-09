package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Customer;
import com.example.Entity.Mobile;
@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Integer>{
}

