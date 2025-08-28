package com.dikshant.SpringBoot.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    @Override
    public void compile() {
        System.out.print("Compiling through Desktop");
    }
}
