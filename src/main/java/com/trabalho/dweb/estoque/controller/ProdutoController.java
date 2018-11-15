package com.trabalho.dweb.estoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.trabalho.dweb.estoque.model.Produto;
import com.trabalho.dweb.estoque.repository.ProdutoRepository;

public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> getTodosProdutos() {
		return produtoRepository.findAll();
	}
	
	public Produto cadastrarProduto(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public Produto getProdutoPorId(Integer produtoId) {
		
		Produto produto = produtoRepository.findOne(produtoId);
		
		try {
			if (produto != null) {
				System.out.println("Produto " + produtoId + "capturado com sucesso.");
			} else {
				System.out.println("Produto de id " + produtoId + "não existe.");
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		return produto;
	}
	
	public Produto atualizarProduto(Integer produtoId, Produto produtoAtualizado) {
		
		Produto produto = produtoRepository.findOne(produtoId);
		
		try {
			if (produto != null) {
				produto.setPreco(produtoAtualizado.getPreco()).setDescricao(produtoAtualizado.getDescricao());
				produtoRepository.save(produto);
				System.out.println("Produto " + produtoId + " atualizado com sucesso.");
			} else {
				System.out.println("Produto de id " + produtoId + "não existe.");
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		return produto;
	}
	
	public void removerProduto(Integer produtoId) {
		
		Produto produto = produtoRepository.findOne(produtoId);
		
		try {
			if (produto != null) {
				produtoRepository.delete(produtoId);
				System.out.println("Produto " + produtoId + " removido com sucesso.");
			} else {
				System.out.println("Produto de id " + produtoId + "não existe.");
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}  
