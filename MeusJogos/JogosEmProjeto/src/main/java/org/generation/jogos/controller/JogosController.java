package org.generation.jogos.controller;

import java.util.List;

import org.generation.jogos.repository.JogosRepository;
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
@RequestMapping("/jogos")
@CrossOrigin("*")
public class JogosController<Jogos, repositoty> {

	@Autowired
	private JogosRepository repositoty;

	@GetMapping
	public ResponseEntity<List<Jogos>> GetAll() {
		return ResponseEntity.ok(repositoty.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Jogos> GetById(@PathVariable long id) {

		return repositoty.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());

	}

	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Jogos>> GetByTitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(repositoty.findAllByTituloContainingIgnoreCase(titulo));
	}

	@PostMapping
	public ResponseEntity<Jogos> post(@RequestBody Jogos jogos) {

		return ResponseEntity.status(HttpStatus.CREATED).body(repositoty.save(jogos));
	}

	@PutMapping
	public <repositoty> ResponseEntity<Jogos> put(@RequestBody Jogos jogos) {

		return ResponseEntity.status(HttpStatus.OK).body(repositoty.save(jogos));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repositoty.deleteById(id);
	}

}
