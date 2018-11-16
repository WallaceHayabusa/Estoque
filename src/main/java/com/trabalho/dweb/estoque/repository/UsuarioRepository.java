package com.trabalho.dweb.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalho.dweb.estoque.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
