package com.io.projetoJpa.entity;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.*;

@Document
public class Usuarios {
	
	@Id
	private String codigo;
	private String nome;
	private String email;
	
	private Set<Regras> regras;
	
	public Usuarios() {

	}
	
	public Usuarios(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}



	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	

}
