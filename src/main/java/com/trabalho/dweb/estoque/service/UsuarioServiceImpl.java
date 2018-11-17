package com.trabalho.dweb.estoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabalho.dweb.estoque.model.Usuario;
import com.trabalho.dweb.estoque.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> getTodosUsuarios() {
		return usuarioRepository.findAll();
	}
	
	@Override
	public Usuario getUsuarioPorId(Long usuarioId) {
		Usuario usuario = usuarioRepository.findOne(usuarioId);
		
		if (usuario != null) {
			return usuario;
		}
		
		return null;
	}

	@Override
	public Usuario cadastrar(Usuario usuario) {
		List<Usuario> usuariosCadastrados = usuarioRepository.findAll();
		
		if (!usuario.getLogin().equals("") && !usuario.getSenha().equals("")) {
			
			for(Usuario usuarioCadastrado : usuariosCadastrados) {
				if (!usuariosCadastrados.isEmpty() && !usuario.getLogin().equals(usuarioCadastrado.getLogin())) {
					System.out.println("Vai salvar");
					return usuarioRepository.save(usuario);
				}
			}
		}
		
		return null;
	}
}
