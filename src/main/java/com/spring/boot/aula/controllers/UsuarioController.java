package com.spring.boot.aula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.aula.entities.Usuario;
import com.spring.boot.aula.services.UsuarioService;


@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public List<Usuario> procuraTodos(){
		return service.procuraTodos();
		
	}
	
	@GetMapping(value = "/{id}")
	public Usuario procuraPorId (@PathVariable Integer id) {
		return service.procuraPorId(id);
	}
	
	@PostMapping
	public String adicionarUsuario (@RequestBody Usuario usuario) {
		return service.adicionarUsuario(usuario);
		
	}
	
	@PutMapping(value = "/{id}")
	public String editarUsuario (@PathVariable Integer id, @RequestBody Usuario usuario) {
		return service.editarUsuario(id, usuario);
	}
	
	@DeleteMapping(value = "/{id}")
	public void excluirUsuario(@PathVariable Integer id) {
		service.excluirUsuario(id);
	}
	
}
