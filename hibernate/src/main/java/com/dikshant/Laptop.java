package com.dikshant;

import jakarta.persistence.*;

@Entity
public class Laptop {

    @Id
    private int LaptopId;
    private String brand;
    private String model;
    private int ram;

    @ManyToOne
    private Progammers progammers;


    public Progammers getProgammers() {
        return progammers;
    }

    public void setProgammers(Progammers progammers) {
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
                ", progammers=" + progammers +
                '}';
    }
}
