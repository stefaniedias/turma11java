package org.generation.blohgPessoal.controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/tema")
public class TemaController {

	
	@Autowired
	private org.generation.blohgPessoal.repository.TemaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<org.generation.blohgPessoal.model.Tema>> getAll (){
		
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<org.generation.blohgPessoal.model.Tema> getById(@PathVariable Long id){
		
		return ((Object) repository.findById(id)).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping ("/nome/{nome}")
	public ResponseEntity<List<org.generation.blohgPessoal.model.Tema>> getByName(@PathVariable String nome){
		
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<org.generation.blohgPessoal.model.Tema> post (@RequestBody org.generation.blohgPessoal.model.Tema tema){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tema));
	}
	
	@PutMapping
	public ResponseEntity<org.generation.blohgPessoal.model.Tema> put (@RequestBody org.generation.blohgPessoal.model.Tema tema){
		return ResponseEntity.ok(repository.save(tema));
	}
	
	@DeleteMapping ("/{id}")
	public void delete (@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	 
}
