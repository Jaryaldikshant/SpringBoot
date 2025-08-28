package com.dikshant.SpringBoot.repository;

import com.dikshant.SpringBoot.model.Laptop;
import org.springframework.stereotype.Repository;


@Repository
public class LaptopRepository {

    public void save(Laptop laptop){
        System.out.println("Saved in DB");
    }
}
