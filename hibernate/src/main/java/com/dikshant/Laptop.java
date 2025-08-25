package com.dikshant;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Laptop {

    @Id
    private int LaptopId;
    private String brand;
    private String model;
    private int ram;

    @ManyToMany(mappedBy = "laptops")
    private List<Progammers> progammers;


    public List<Progammers> getProgammers() {
        return progammers;
    }

    public void setProgammers(List<Progammers> progammers) {
        this.progammers = progammers;
    }

    public int getLaptopId() {
        return LaptopId;
    }

    public void setLaptopId(int laptopId) {
        LaptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "LaptopId=" + LaptopId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
