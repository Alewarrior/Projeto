package br.com.senac.inicializacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.senac.dominio.Aluno;
import br.com.senac.repositorio.AlunoRepositorio;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	AlunoRepositorio alunoRepositorio;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Lucas");
		
		alunoRepositorio.save(aluno1);
		
		
	}
	
	

}
