package com.trabalho.dweb.estoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabalho.dweb.estoque.model.Produto;
import com.trabalho.dweb.estoque.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public List<Produto> getTodosProdutos() {
		return produtoRepository.findAll();
	}

	@Override
	public Produto cadastrarProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	@Override
	public Produto getProdutoPorId(Long produtoId) {
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

	@Override
	public Produto atualizarProduto(Long produtoId, Produto produtoAtualizado) {
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

	@Override
	public void removerProduto(Long produtoId) {
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
