package com.dikshant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
//@Table(name = "Emp_Table")
public class Progammers {

    @Id
//    @Column(name = "Emp_Id")
    private int pId;

//    @Column(name = "Employe_Name")
    private String pName;

    // this column will not store in db if we use @Transient
//    @Transient
//    @Column(name = "Tech_Stack")
    private String tech;

    @ManyToMany
    private List<Laptop> laptops;


    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Progammers{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
