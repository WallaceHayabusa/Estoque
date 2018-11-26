package com.trabalho.dweb.estoque.service;

import java.util.List;

import com.trabalho.dweb.estoque.model.Produto;

public interface ProdutoService {
	
	public List<Produto> getTodosProdutos();
	
	public Produto cadastrar(Produto produto);

	public Produto getProdutoPorId(Long produtoId);
	
	public Produto atualizar(Long produtoId, Produto produtoAtualizado) throws Exception;
	
	public void removerProduto(Long produtoId);
}
