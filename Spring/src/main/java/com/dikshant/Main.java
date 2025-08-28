package com.dikshant;

import com.dikshant.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();

//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();

        Programmers obj1 = context.getBean(Programmers.class);
        System.out.println(obj1.getAge());
        obj1.code();




//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Programmers programmers = (Programmers) context.getBean("programmers");
//        programmers.setAge(24);
//        System.out.println(programmers.getAge());
//        programmers.code();

//        Desktop desktop = (Desktop) context.getBean("com2");


    }
}