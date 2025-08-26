package com.dikshant.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Programmers {

    @Autowired
    Laptop laptop;


    public void code(){
        laptop.compile();

        System.out.print("---> Coding..");

    }
}
