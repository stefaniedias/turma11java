package org.generation.blohgPessoal.controller;

	
	import java.util.List;
	import java.util.Optional;

import org.generation.blohgPessoal.model.UsuarioLogin;
import org.generation.blohgPessoal.model.UsuarioModel;
import org.generation.blohgPessoal.repository.UsuarioRepository;
import org.generation.blohgPessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/usuarios")
	@CrossOrigin("*")
	public class UsuarioController {
		
		@Autowired
		private UsuarioRepository repository;
		
		@Autowired
		private UsuarioService usuarioService;

		@GetMapping
		public ResponseEntity<List<UsuarioModel>> GetAll() {
			return ResponseEntity.ok(repository.findAll());
		}

		@PostMapping("/logar")
		public ResponseEntity<UsuarioLogin> Autentication(@RequestBody Optional<UsuarioLogin> user) {
			return usuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
		}

		@GetMapping("/{id}")
		public ResponseEntity<UsuarioModel> GetById(@PathVariable long id) {
			return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
		}


		@PostMapping("/cadastrar")
		public ResponseEntity<UsuarioModel> Post(@RequestBody UsuarioModel usuario) {
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(usuarioService.CadastrarUsuario(usuario));
		}

		@PutMapping
		public ResponseEntity<UsuarioModel> Put(@RequestBody UsuarioModel usuario) {
			return ResponseEntity.ok(repository.save(usuario));
		}

	}

	
	
	
