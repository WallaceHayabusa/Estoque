package com.trabalho.dweb.estoque.service;

import java.util.List;

import com.trabalho.dweb.estoque.model.Produto;

public interface ProdutoService {
	
	public List<Produto> getTodosProdutos();
	
	public Produto cadastrarProduto(Produto produto);

	public Produto getProdutoPorId(Long produtoId);
	
	public Produto atualizarProduto(Long produtoId, Produto produtoAtualizado);
	
	public void removerProduto(Long produtoId);
}
