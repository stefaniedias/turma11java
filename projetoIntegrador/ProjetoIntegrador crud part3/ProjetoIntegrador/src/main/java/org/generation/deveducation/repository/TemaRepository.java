package org.generation.deveducation.repository;

import java.util.List;
import java.util.Optional;

import org.generation.deveducation.model.TemaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<TemaModel, Long> {

	Optional<TemaModel> findByMateriaAndSubmateria(String materia, String submateria);
	
	public List<TemaModel> findAllByMateriaContainingIgnoreCase(String materia);
	
}
