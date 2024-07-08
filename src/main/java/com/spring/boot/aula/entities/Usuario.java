package com.spring.boot.aula.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Usuario {

		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		
		private Integer id;
		private String nome;
		private String senha;
		private String email;
		
		public Usuario () {}
		
		public Usuario(int id, String nome, String senha, String email) {
			super();
			this.id = id;
			this.nome = nome;
			this.senha = senha;
			this.email = email;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
	}

	

