package com.feiraBrasil.IFeiraAPI.service;

import java.util.List;

import com.feiraBrasil.IFeiraAPI.model.Usuario;

public interface UsuarioService {
	
	public List<Usuario> getAll();
	
	public Usuario getId(int id);
	
	public Usuario createOrUpdate(Usuario usuario);
	
	public void delete(int id);

}
