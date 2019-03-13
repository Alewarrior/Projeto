package br.com.senac.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
	
	private static final long 	serialVersionUID = 1L;

	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer Id_Usuario;
	
	
	
	
	public Integer getId_Usuario() {
		return Id_Usuario;
	}

	public void setId_Usuario(Integer id_Usuario) {
		Id_Usuario = id_Usuario;
	}

	private String nome;
	
	private String sobrenome;
	
	private String email;
	
	private String senha;

	public Integer getId() {
		return Id_Usuario;
	}

	public void setId(Integer id) {
		Id_Usuario = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
