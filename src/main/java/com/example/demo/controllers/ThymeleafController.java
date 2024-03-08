package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Subject;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

	//1.
	@GetMapping("/thymeleaf")
	public String thymeleaf(){
		return "thymeleaf";
	}
	
	//2.
	@GetMapping("/thymeleaf2")
	public String thymeleaf2(Model model){
		model.addAttribute("mensaje", "Hola a todos!!!!");
		return "thymeleaf2";
	}
	
	//3.
	@GetMapping("/thymeleaf3")
	public String thymeleaf3(Model model){
		
		List<Subject> listSubject = new ArrayList<Subject>();
		listSubject.add(new Subject(0, "ABC1515", "Lenguaje de Programación I"));
		listSubject.add(new Subject(0, "RTY1515", "Lenguaje de Programación II"));
		listSubject.add(new Subject(0, "UJN1515", "POO"));
		listSubject.add(new Subject(0, "IK1515", "Android"));
		
		model.addAttribute("cursos", listSubject);
		model.addAttribute("mensaje", "Bienvenido a mi aplicación Spring Boot con Bootstrap");
		return "thymeleaf3";
	}
	
	//4.Condicionales
	@GetMapping("/thymeleaf4")
	public String thymeleaf4(Model model){
		
		model.addAttribute("flag", false);
		model.addAttribute("mensaje", "Buenas noches");
		
		return "thymeleaf4";
	}
	
	//5.
	@GetMapping("/thymeleaf5")
	public String thymeleaf5(Model model){
		
		List<Subject> listSubject = new ArrayList<Subject>();
		listSubject.add(new Subject(0, "ABC1515", "Lenguaje de Programación I"));
		listSubject.add(new Subject(0, "RTY1515", "Lenguaje de Programación II"));
		listSubject.add(new Subject(0, "UJN1515", "POO"));
		listSubject.add(new Subject(0, "IK1515", "Android"));
		
		model.addAttribute("cursos", listSubject);
		model.addAttribute("mensaje", "Bienvenido a mi aplicación Spring Boot con Bootstrap");
		return "thymeleaf5";
	}
	
	//6.
	@GetMapping("/thymeleaf6")
	public String thymeleaf6(Model model){
		
		List<Subject> listSubject = new ArrayList<Subject>();
		listSubject.add(new Subject(1, "ABC1515", "Lenguaje de Programación I"));
		listSubject.add(new Subject(2, "RTY1515", "Lenguaje de Programación II"));
		listSubject.add(new Subject(3, "UJN1515", "POO"));
		listSubject.add(new Subject(4, "IK1515", "Android"));
		
		model.addAttribute("cursos", listSubject);
		
		return "thymeleaf6";
	}
	
}













