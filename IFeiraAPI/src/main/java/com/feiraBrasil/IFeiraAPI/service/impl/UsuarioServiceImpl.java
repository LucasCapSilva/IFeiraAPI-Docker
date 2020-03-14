package com.feiraBrasil.IFeiraAPI.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feiraBrasil.IFeiraAPI.model.Usuario;
import com.feiraBrasil.IFeiraAPI.repository.UsuarioRepository;
import com.feiraBrasil.IFeiraAPI.service.UsuarioService;

@Service
public class UsuarioServiceImpl  implements UsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> getAll() {
		List<Usuario> usuarios= (List<Usuario>)usuarioRepository.findAll();
		return usuarios;
	}

	@Override
	public Usuario getId(int id) {
		return usuarioRepository.findById(id).orElse(null);
	}

	@Override
	public Usuario createOrUpdate(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public void delete(int id) {
		usuarioRepository.deleteById(id);	
	}

}
