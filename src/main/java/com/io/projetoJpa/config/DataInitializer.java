package com.io.projetoJpa.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.io.projetoJpa.entity.Usuarios;
import com.io.projetoJpa.repository.UsuariosRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>  {
	
	@Autowired
	UsuariosRepository usuarioRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		List<Usuarios> usuarios = usuarioRepository.findAll();
		
		if (usuarios.isEmpty()) {
			
			createUsuario("Nataniel", "nataniel.paiva@gmail.com");
			createUsuario("Miranda", "ailton.prg@gmail.com");
			createUsuario("Marcelo", "marcelo@gmail.com");
		
		}
		
		Usuarios usuario = usuarioRepository.findByemailQualquerCoisa("nataniel.paiva@gmail.com");
				
		System.out.println(usuario.getCodigo());
		System.out.println(usuario.getNome());
		System.out.println(usuario.getEmail());
		
		
	}
	
	public void createUsuario(String nome, String email) {
		
		Usuarios usuario = new Usuarios(nome, email);
		
		usuarioRepository.save(usuario);
		
	}
	
	

}
