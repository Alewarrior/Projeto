package br.com.senac.inicializacao;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent>{
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("Inicializando a aplicação");
	}

}
