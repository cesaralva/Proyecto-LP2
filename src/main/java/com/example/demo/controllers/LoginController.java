package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/login")
public class LoginController {

	@GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
	
	@PostMapping("/login")
    public String login(@RequestParam("username") String username, 
    		@RequestParam("password") String password) {
        // Aquí puedes agregar la lógica para verificar las credenciales del usuario
        // Por simplicidad, vamos a asumir que el usuario y la contraseña son "admin"
		
        if ("admin".equals(username) && "admin".equals(password)) {
            // Si las credenciales son válidas, redirigir a la página de inicio
            return "redirect:/login/home";
        } else {
            // Si las credenciales son inválidas, volver a mostrar el formulario de inicio de sesión con un mensaje de error
            return "redirect:/login/login?error=true";
        }
    }
	
	@GetMapping("/home")
    public String homePage() {
        // Esta es la página a la que se redirige después de iniciar sesión correctamente
        return "home";
    }
	
}