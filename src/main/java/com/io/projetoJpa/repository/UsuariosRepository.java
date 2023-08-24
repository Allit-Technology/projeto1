package com.io.projetoJpa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.io.projetoJpa.entity.Usuarios;


public interface UsuariosRepository extends MongoRepository<Usuarios, Long>{
	
	Usuarios findBynome(String nome);
	
	@Query("{ 'email' : ?0 }")
	Usuarios findByemailQualquerCoisa(String email);
	
	Usuarios findBynomeIgnoreCaseLike(String nome);
	
	
}
