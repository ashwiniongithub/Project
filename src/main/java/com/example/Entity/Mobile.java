package com.example.Entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.IdClass;
import javax.persistence.ManyToMany;

@Entity

public class Mobile {
	@Id
    @Column(name="m_id")
    private int m_id;
    private String m_company;
    private String model;
    private int f_cam;
    private int r_cam;
    private int ram;
    private double price;

    /*@ManyToMany(mappedBy="employee")
    private List<Employee> employees;
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }*/


    public int getM_id() {
        return m_id;
    }
    public void setM_id(int m_id) {
        this.m_id = m_id;
    }
    public String getM_company() {
        return m_company;
    }
    public void setM_company(String m_company) {
        this.m_company = m_company;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getF_cam() {
        return f_cam;
    }
    public void setF_cam(int f_cam) {
        this.f_cam = f_cam;
    }
    public int getR_cam() {
        return r_cam;
    }
    public void setR_cam(int r_cam) {
        this.r_cam = r_cam;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Mobile(int m_id, String m_company, String model, int f_cam, int r_cam, int ram, double price) {
        super();
        this.m_id = m_id;
        this.m_company = m_company;
        this.model = model;
        this.f_cam = f_cam;
        this.r_cam = r_cam;
        this.ram = ram;
        this.price = price;
    }
    public Mobile() {
        super();
    }
    @Override
    public String toString() {
        return "Mobile [m_id=" + m_id + ", m_company=" + m_company + ", model=" + model + ", f_cam=" + f_cam
                + ", r_cam=" + r_cam + ", ram=" + ram + ", price=" + price + "]";
    }

}