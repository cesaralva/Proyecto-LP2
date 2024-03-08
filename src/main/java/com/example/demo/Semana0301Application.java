package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.controllers.IndexController;

@SpringBootApplication
public class Semana0301Application {

	public static void main(String[] args) {
		SpringApplication.run(Semana0301Application.class, args);
		
        // ApplicationContext context = new AnnotationConfigApplicationContext(IndexController.class);
        // IndexController controlador = context.getBean(IndexController.class);
        // controlador.showIndex();
	}
	
	/*@GetMapping("/")
    public String defaultView() {
        return "login";
    }*/

}
