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
	public List<Produto> getTodosProdutosComQuantidadeMinimaOuMaxima() {
		return produtoRepository.getTodosProdutosComQuantidadeMinimaOuMaxima();
	}

	@Override
	public Produto cadastrar(Produto produto) {
		if (isQuantidadeExata(produto) && !isProdutoNoBanco(produto)) {
			return produtoRepository.save(produto);
		}
		System.out.println("Não foi possível realizar o cadastro");
		return null;
	}

	@Override
	public Produto getProdutoPorId(Long produtoId) {
		Produto produto = produtoRepository.findOne(produtoId);

		try {
			if (produto != null) {
				System.out.println("Produto " + produtoId + " capturado com sucesso.");
			} else {
				System.out.println("Produto de id " + produtoId + " não existe.");
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

		return produto;
	}

	@Override
	public Produto atualizar(Long produtoId, Produto produtoAtualizado) throws Exception {
		
		Produto produto = produtoRepository.findOne(produtoId);

		produto.setDescricao(produtoAtualizado.getDescricao()).setPreco(produtoAtualizado.getPreco()).setQuantidade(produtoAtualizado.getQuantidade());
		
		if (produto != null && produtoAtualizado.getQuantidade() >= produto.getQuantidadeMinima()
				&& produtoAtualizado.getQuantidade() <= produto.getQuantidadeMaxima()) {
			
			produto.setPreco(produtoAtualizado.getPreco()).setDescricao(produtoAtualizado.getDescricao());
			produtoRepository.save(produto);
			
			System.out.println("Produto " + produtoId + " atualizado com sucesso.");
		} else {
			throw new Exception();
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

	private boolean isQuantidadeExata(Produto produto) {
		List<Produto> produtosCadastrados = getTodosProdutos();

		if (produtosCadastrados.isEmpty()) {
			return true;
		}

		for (Produto produtoCadastrado : produtosCadastrados) {
			if (produto.getQuantidade() >= produtoCadastrado.getQuantidadeMinima()
					&& produto.getQuantidade() <= produtoCadastrado.getQuantidadeMaxima()) {
				return true;
			}
		}

		return false;
	}

	private boolean isProdutoNoBanco(Produto produto) {

		List<Produto> produtosCadastrados = produtoRepository.findAll();

		if (produtosCadastrados.isEmpty()) {
			return false;
		}

		for (Produto produtoCadastrado : produtosCadastrados) {
			if (produto.getDescricao().equals(produtoCadastrado.getDescricao())) {
				return true;
			}
		}

		return false;
	}

}
