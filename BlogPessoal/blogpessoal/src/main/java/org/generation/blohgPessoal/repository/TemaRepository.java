package org.generation.blohgPessoal.repository;


import java.util.List;

import org.generation.blogpessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository {
	
	public interface TemaRepository extends JpaRepository<Tema, Long> {
		public List<Tema> findAllByDescricaoContainingIgnoreCase( String descricao);
}

	public Object findById(Long id);

	public void deleteById(Long id);

	public Object findAllByDescricaoContainingIgnoreCase(String nome);
}