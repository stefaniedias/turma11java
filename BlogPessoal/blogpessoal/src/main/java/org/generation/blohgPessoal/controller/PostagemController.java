package org.generation.blohgPessoal.controller;

import java.util.List;

import org.generation.blohgPessoal.model.Postagem;
import org.generation.blohgPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.implementation.bind.annotation.Argument;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController<Postagem> {
     

		@Autowired
		private PostagemRepository repositoty;

		@GetMapping
		public ResponseEntity<List<org.generation.blohgPessoal.model.Postagem>> GetAll() {
			return ResponseEntity.ok(repositoty.findAll());
		}

		@GetMapping("/{id}")
		public ResponseEntity<org.generation.blohgPessoal.model.Postagem> GetById(@PathVariable long id) {

			return repositoty.findById(id)
					.map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());

		}
		
		@GetMapping("/titulo/{titulo}")
		public ResponseEntity<List<org.generation.blohgPessoal.model.Postagem>> GetByTitulo(@PathVariable String titulo){
			return ResponseEntity.ok(repositoty.findAllByTituloContainingIgnoreCase(titulo));
		}
		
		@PostMapping
		public 	ResponseEntity<Postagem> post (@RequestBody Postagem postagem) 
		{
			return	ResponseEntity.status(HttpStatus.CREATED).body(repositoty.save(postagem));
		}

		@PutMapping
		public 	ResponseEntity<Postagem> put (@RequestBody Postagem postagem) 
		{
			return	ResponseEntity.status(HttpStatus.OK).body(repositoty.save(postagem));
		}

 @DeleteMapping("/{id}")
 public void delete(@PathVariable long id) {
	repositoty.deleteById(id);
	}

 @GetMapping(value = "/maior")
	public ResponseEntity<List<org.generation.blohgPessoal.model.Postagem>> findAllMaior(){
		return ResponseEntity.ok(repositoty.findAllMaior());
	}
 @GetMapping(value = "/ordem")
	public ResponseEntity<List<org.generation.blohgPessoal.model.Postagem>> anosDesc(){
		return ResponseEntity.ok(repositoty.anosDesc());
	}
 @GetMapping(value = "/intervalo")
	public ResponseEntity<List<org.generation.blohgPessoal.model.Postagem>> anosIntervalos(){
		return ResponseEntity.ok(repositoty.anosIntervalos());
	}
 @GetMapping(value = "/asc")
	public ResponseEntity<List<org.generation.blohgPessoal.model.Postagem>> anosAsc(){
		return ResponseEntity.ok(repositoty.anosAsc());
	}

 
 
}
