package com.trabalho.dweb.estoque.service;

import java.util.List;

import com.trabalho.dweb.estoque.model.Usuario;

public interface UsuarioService {

	public List<Usuario> getTodosUsuarios();
	
	public Usuario getUsuarioPorId(Long usuarioId);
	
	public Usuario cadastrar(Usuario usuario);
}
