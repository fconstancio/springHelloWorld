package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade1")
public class Atividade1 {
	@GetMapping
	public String habilidadeMentalidade() {
		return "Mentalidade: Persistência Habilidade: Atenção aos Detalhes";
	}
}
