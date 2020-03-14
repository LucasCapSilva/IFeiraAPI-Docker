package com.feiraBrasil.IFeiraAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feiraBrasil.IFeiraAPI.model.Usuario;
import com.feiraBrasil.IFeiraAPI.service.UsuarioService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> getAllUsuario() {
		return ResponseEntity.ok(usuarioService.getAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getById(@PathVariable int id) {
		return ResponseEntity.ok(usuarioService.getId(id));	
	}
	@PostMapping
	public ResponseEntity<Usuario> post(@RequestBody Usuario usuario) {
		return ResponseEntity.ok(usuarioService.createOrUpdate(usuario));
	}
	@PutMapping
	public ResponseEntity<Usuario> put(@RequestBody Usuario usuario) {
		return ResponseEntity.ok(usuarioService.createOrUpdate(usuario));
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		usuarioService.delete(id);
	}

}
