package com.dikshant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Programmers {


    @Value("25")
    private int age;

    @Autowired
    private Computer com;


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Programmers(int age) {
        System.out.println("Para Constructor Called");
        this.age = age;
    }

    public Programmers() {
        System.out.println("Programmers Object created");
    }

    public void code(){
        System.out.println("coding....................");
        com.compile();
    }
}
