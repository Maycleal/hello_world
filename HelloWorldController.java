package com.example.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping("/hello_world")
	public String helloWorld() {
		return "Hello World!!";
	}
	@GetMapping("/bsm_generation")
	public String bsmgeneration() {
		return "Persistencia, Mentalidade de crescimento, Orientação ao futuro, Responsabilidade pessoal, Trabalho em equipe, Comunicação, Orientação aos detalhes e Proatividade ";
	}
	@GetMapping("/objetivos")
	public String objetivos_aprendizado() {
		return "Foco na organização e proatividade. Aprender aos novos programas que estão sendo ensinados.";	
    }
}
