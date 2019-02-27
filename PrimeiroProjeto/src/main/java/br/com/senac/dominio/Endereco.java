package br.com.senac.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Endereco implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer id;
	private String rua;
	private String complemento;
	private String bairro;
	private String cep;
	
	@JsonIgnore // o endereço não precisa saber o aluno para o json.  Isso já vai acontecer na classe aluno.
	@ManyToOne
	@JoinColumn(name="aluno_id")
	private Aluno aluno;
	
	
	@ManyToOne
	@JoinColumn(name="cidade_id")
	private Cidade cidade;
	
	

}
