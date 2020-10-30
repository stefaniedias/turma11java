package com.helloworld.halloo.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/halloo")
public class HellooController {
	
	@GetMapping
	public String halloo() {
         return "hello generation, a melhor turma 11!!!";
	}

}
