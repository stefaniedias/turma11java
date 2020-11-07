package org.generation.blohgPessoal.repository;

import java.util.List;

import org.generation.blohgPessoal.controller.PostagemController;
import org.generation.blohgPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
 public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);

 @Query(value= "select * from postagens where ano > 2011", nativeQuery = true)
    List<Postagem> findAllMaior();

    
    @Query(value= "select * from postagens where ano > 2011 ORDER BY DESC", nativeQuery = true)
    List<Postagem> anosDesc();
    
    @Query(value= "select * from postagens ORDER BY ano ASC > 2011", nativeQuery = true)
    List<Postagem> anosAsc();
    
    @Query(value= "select * from postagens where ano >= 2011 and ano <=2013", nativeQuery = true)
    List<Postagem> anosIntervalos();
    
       





		




		
}
