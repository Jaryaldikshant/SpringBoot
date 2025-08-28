package com.dikshant.SpringBoot.service;
import com.dikshant.SpringBoot.model.Laptop;
import com.dikshant.SpringBoot.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LaptopService {


    // injecting this object by using autowired, Can also use setter injection instead
    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop laptop) {
       repo.save(laptop);
    }

    public boolean isGoodForPrograming(Laptop laptop){
        return true;
    }
}
