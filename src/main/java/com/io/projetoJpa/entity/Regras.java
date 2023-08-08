package com.io.projetoJpa.entity;

import jakarta.persistence.*;

@Entity
public class Regras {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	private String nome;
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
	

}
