package com.example.Entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employee {
	@Id
    @Column(name="emp_id")
    private int emp_id;
    private String emp_name;
    private int age;
    private double sal;

    /*@JsonIgnore
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="mobile_employee",joinColumns=@JoinColumn(name="mobile_id",referencedColumnName="m_id"),inverseJoinColumns=@JoinColumn(name="employee_id",referencedColumnName="emp_id"))
    private List<Mobile> mobile;
    public List<Mobile> getMobile() {
        return mobile;
    }
    public void setMobile(List<Mobile> mobile) {
        this.mobile = mobile;
    }*/

    public int getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }
    public String getEmp_name() {
        return emp_name;
    }
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    public Employee(int emp_id, String emp_name, int age, double sal) {
        super();
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.age = age;
        this.sal = sal;
    }
    public Employee() {
        super();
    }
    @Override
    public String toString() {
        return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", age=" + age + ", sal=" + sal + "]";
    }

}
