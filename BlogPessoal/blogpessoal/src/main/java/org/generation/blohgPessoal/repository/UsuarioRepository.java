package org.generation.blohgPessoal.repository;

import java.util.List;
import java.util.Optional;

import org.generation.blohgPessoal.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
	public List<UsuarioModel> findAllByNomeContainingIgnoreCase(String nome);

	public Optional<UsuarioModel> findByUsuarioAndSenha(String usuario, String senha);

	public Optional<UsuarioModel> findByUsuario(String usuario);
}
