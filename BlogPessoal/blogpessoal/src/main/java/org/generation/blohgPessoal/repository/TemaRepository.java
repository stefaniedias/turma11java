package org.generation.blohgPessoal.repository;


import java.util.List;
import java.util.Optional;

import org.generation.blohgPessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

	
	public interface TemaRepository extends JpaRepository<Tema, Long> {
		public List<Tema> findAllBydescricaoContainingIgnoreCase(String descricao);


	public Optional<Tema> findById(Long id);

	public void deleteById(Long id);

	public Object findAllByDescricaoContainingIgnoreCase(String nome);
}