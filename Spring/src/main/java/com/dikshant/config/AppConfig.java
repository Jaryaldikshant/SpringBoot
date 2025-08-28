package com.dikshant.config;


import com.dikshant.Computer;
import com.dikshant.Desktop;
import com.dikshant.Laptop;
import com.dikshant.Programmers;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.dikshant")
public class AppConfig {
//
////    @Bean(name = "com2")
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    public Programmers programmers(@Qualifier("desktop") Computer com){
//        Programmers obj = new Programmers();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }

}
