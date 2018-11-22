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
	
	@Column(name = "descricao", nullable = false, length = 50, unique = true)
	private String descricao;
	
	@Column(name = "preco", nullable = false, precision = 2)
	private Double preco;
	
	@Column(name = "quantidade", nullable = false)
	private int quantidade;
	
	@Column(name = "quantidadeMinima", nullable = false)
	private int quantidadeMinima;

	@Column(name = "quantidadeMaxima", nullable = false)
	private int quantidadeMaxima;
	
	public Produto(Long id, String descricao, Double preco, int quantidade, int quantidadeMinima, int quantidadeMaxima) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
		this.quantidadeMinima = quantidadeMinima;
		this.quantidadeMaxima = quantidadeMaxima;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidadeMinima() {
		return quantidadeMinima;
	}
	
	public Produto setQuantidadeMinima(int quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
		return this;
	}
	
	public int getQuantidadeMaxima() {
		return quantidadeMaxima;
	}

	public Produto setQuantidadeMaxima(int quantidadeMaxima) {
		this.quantidadeMaxima = quantidadeMaxima;
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
