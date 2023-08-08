package com.io.projetoJpa.entity;

import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	private String nome;
	private String email;
	
	@ManyToMany
	private Set<Regras> regras;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
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
