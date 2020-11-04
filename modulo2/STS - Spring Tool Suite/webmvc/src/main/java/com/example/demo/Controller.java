package com.example.demo;

import java.util.List;
import java.util.Optional;

on.WebMvcConfigurer;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
public class Controller implements WebMvcConfigurer {
	
	
	//para acessar a pagina pelo local host;8080
	//view= front
	//controller =requests e getmapping
	//toda vez que voc clicar no barra, voce sera dorecionado para index
	
	public void addViewController (ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/index.html");
	}

	
	@Autowired
	private ManuntencaoRepository repository;
	
	@GetMapping ("/manutencoes")
	public List<ManurtencaoTable> buscarTodos (){
		return repository.findAll();
	}
	
	@GetMapping("/manutencoes/{id}")
	public Optional<ManurtencaoTable> buscarUm(@PathVariable Long id){
		return repository.findById(id);
	}
	
	@PostMapping("manutencoes")
	public ManurtencaoTable criar (@RequestBody ManurtencaoTable objetoManutencao) {
		repository.save(objetoManutencao);
		return objetoManutencao;
	}
}		 
			 