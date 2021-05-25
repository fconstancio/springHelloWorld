package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade2")
public class Atividade2 {
	@GetMapping
	public String objetivo() {
		return "Objetivo da Semana: Relembras conceitos e boas práticas de java e aprender/praticar Spring";
	}

}
