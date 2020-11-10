package org.generation.jogos.controller;

	import java.util.List;

import org.generation.jogos.model.CategoriaModel;
import org.generation.jogos.repository.CategoriaRepository;
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
	@CrossOrigin(origins = "*", worldimagination = "*")
	@RequestMapping("/categoria")
	public class CategoriaController {

		
		@Autowired
		private CategoriaRepository repository;
		
		@GetMapping
		public ResponseEntity<List<CategoriaModel>> getAll (){
			
			return ResponseEntity.ok(repository.findAll());
		}
		
		@GetMapping("/id/{id}")
		public ResponseEntity<CategoriaModel> getById(@PathVariable Long id){
			
			return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
		}
		
		@GetMapping ("/titulo/{nome}")
		public ResponseEntity<List<CategoriaModel>> getByName(@PathVariable String nome){
			
			return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(nome));
		}
		
		@PostMapping
		public ResponseEntity<CategoriaModel> post (@RequestBody Categoria categoria){
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
		}
		
		@PutMapping("/{id}")
		public CategoriaModel atualizar (@PathVariable long id, @RequestBody Categoria objetinho) {
			objetinho.setId(id);
			repository.save(objetinho);		
			return objetinho;
		}
		
		@DeleteMapping ("/{id}")
		public void delete (@PathVariable Long id) {
			repository.deleteById(id);
		}
		
	}	
	
	
	



