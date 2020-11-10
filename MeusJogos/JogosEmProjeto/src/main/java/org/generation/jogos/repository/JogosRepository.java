package org.generation.jogos.repository;


	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;


	@Repository
	public interface JogosRepository extends JpaRepository<Jogos, Long> {

		public List<Jogos> findAllByTituloContainingIgnoreCase(String titulo);

	}

