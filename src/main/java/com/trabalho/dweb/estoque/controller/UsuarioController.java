package com.trabalho.dweb.estoque.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.trabalho.dweb.estoque.model.Usuario;
import com.trabalho.dweb.estoque.repository.UsuarioRepository;

public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario criarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
}
