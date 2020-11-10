package org.generation.jogos.repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;


	@Repository
	public interface JogadorRepository extends JpaRepository<Jogador, Long> {

}
