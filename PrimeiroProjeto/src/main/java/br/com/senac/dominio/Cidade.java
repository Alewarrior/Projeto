package br.com.senac.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity

public class Cidade implements Serializable {
	
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id_Cidade;
	
	private String nome;
	
	
		
	public Integer getId_Cidade() {
		return Id_Cidade;
	}

	public void setId_Cidade(Integer id_Cidade) {
		Id_Cidade = id_Cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@JsonIgnore // o estado não precisa conhecer as cidades para o json. Isso vai acontecer na classe cidade.
	@ManyToOne
	@JoinColumn(name = "Id_Estado")
	private Estado estado;

	public Integer getId() {
		return Id_Cidade;
	}

	public void setId(Integer id) {
		Id_Cidade = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
