package com.trabalho.dweb.estoque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabalho.dweb.estoque.model.Usuario;
import com.trabalho.dweb.estoque.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario getUsuarioPorId(Long usuarioId) {
		Usuario usuario = usuarioRepository.findOne(usuarioId);
		
		if (usuario != null) {
			return usuario;
		}
		
		return null;
	}

}
