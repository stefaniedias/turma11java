package org.generation.jogos.controller;

public class JogadorController {

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	
	@RestController
	@RequestMapping("/jogador")
	public class JogadorController {

		@Autowired
		private JogadorRepository repositoty;

		@GetMapping
		public ResponseEntity<List<Jogador>> GetAll() {
			return ResponseEntity.ok(repositoty.findAll());
		}

		@GetMapping("/{id}")
		public ResponseEntity<Jogador> GetById(@PathVariable long id) {

			return repositoty.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());

		}

		@PostMapping
		public ResponseEntity<Jogador> post(@RequestBody Jogador jogador) {

			return ResponseEntity.status(HttpStatus.CREATED).body(repositoty.save(jogador));
		}

		@PutMapping
		public ResponseEntity<Jogador> put(@RequestBody Jogador jogador) {

			return ResponseEntity.status(HttpStatus.OK).body(repositoty.save(jogador));
		}

		@DeleteMapping("/{id}")
		public void delete(@PathVariable long id) {
			repositoty.deleteById(id);
		}	
	
}
