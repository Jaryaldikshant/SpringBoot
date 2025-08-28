package com.dikshant.SpringBoot;

import com.dikshant.SpringBoot.model.Laptop;
import com.dikshant.SpringBoot.model.Programmers;
import com.dikshant.SpringBoot.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop laptop = context.getBean(Laptop.class);
		service.addLaptop(laptop);


	}

}
