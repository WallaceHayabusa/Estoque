package com.trabalho.dweb.estoque.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "descricao", nullable = false, length = 200)
	private String descricao;
	
	@Column(name = "preco", nullable = false, precision = 2)
	private Double preco;
	
	public Produto(String descricao, Double preco) {
		super();
		this.descricao = descricao;
		this.preco = preco;
	}

	public Produto() {

	}

	public Long getId() {
		return id;
	}

	public Produto setId(Long id) {
		this.id = id;
		return this;
	}

	public String getDescricao() {
		return descricao;
	}

	public Produto setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public Double getPreco() {
		return preco;
	}

	public Produto setPreco(Double preco) {
		this.preco = preco;
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

}
