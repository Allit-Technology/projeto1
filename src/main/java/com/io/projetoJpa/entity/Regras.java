package com.io.projetoJpa.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.*;

@Document
public class Regras {
	@Id
	private String codigo;
	private String nome;
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
	

}
