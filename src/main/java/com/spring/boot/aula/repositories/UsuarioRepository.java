package com.spring.boot.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.aula.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
