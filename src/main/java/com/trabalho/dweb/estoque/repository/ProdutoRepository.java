package com.trabalho.dweb.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalho.dweb.estoque.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
