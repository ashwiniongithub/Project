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
import com.example.Services.MobileService;
import com.example.Entity.Mobile;
@RestController
public class MobileController {
@Autowired
private MobileService mob_ser;
private Object mobileservice;

@GetMapping("/Mobile")
public Iterable<Mobile> displayMobile()
{
   System.out.println("hi");
    return this.mob_ser.getAll();
}
@GetMapping("/Mobile/{id}")
public Optional<Mobile> displayMobilebyid(@PathVariable("id") Long x)
{
    return ((MobileService) this.mobileservice).getMobileById(x);
}
@PutMapping("/Mobile/{id}")
public String updateMobilebyid(@RequestBody Mobile newmob,@PathVariable("id") Long x)
{
    this.mob_ser.Mobileupdate(newmob,x);
    return "Mobile udated";
}
@DeleteMapping("/Mobile/{id}")
public String deleteMobilebyid(@PathVariable("id") Long x)
{
    mob_ser.deleteMobile(x);
    return "Mobile deleted";
}
@PostMapping("/Mobile")
public String createMobile(@RequestBody Mobile newmob)
{
    mob_ser.addmob(newmob);
    return "Mobile added";
}
}
