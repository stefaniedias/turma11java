package org.generation.blohgPessoal.controller;

import java.util.List;

import org.generation.blohgPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
		



	}

