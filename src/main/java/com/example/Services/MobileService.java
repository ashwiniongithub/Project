package com.example.Services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.Repository.EmployeeRepository;
import com.example.Repository.MobileRepository;
import com.example.Entity.Employee;
import com.example.Entity.Mobile;
@Configuration
public class MobileService {
	@Autowired
	private MobileRepository mob_rep=null;

	public List<Mobile> getAll() 
	{
		return  mob_rep.findAll();
	}
	public Optional<Mobile> getMobileById(long a)
	{
		Optional<Mobile> c1=null;
		c1=mob_rep.findById(a);
		return c1;
	}
	public void Mobileupdate(Mobile c, long a)
	{
		Optional<Mobile> c1=null;
		c1=mob_rep.findById(a);
		c1.ifPresent(y->mob_rep.save(c));
	}
	public void deleteMobile(long a)
	{

		mob_rep.deleteById(a);

	}
	public void addmob(Mobile c)
	{
		Mobile save = mob_rep.save(c);

	}

}
