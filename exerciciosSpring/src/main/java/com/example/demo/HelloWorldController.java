package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/exercicios")
@RestController

public class HelloWorldController {
	
	@GetMapping("/habilidades")
	public String habilidades () {
		
		return "Necessária muita persistência e atenção aos detalhes!";
		
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		
		return "Conhecer o Spring e MySQL e interagir com as respectivas plataformas e programas."; 
	}

	
}
