package com.io.projetoJpa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.io.projetoJpa.repository.UsuariosRepository;

@Controller
public class UsuariosController {
	
	private UsuariosRepository usuarioRepository;
	
	public UsuariosController (UsuariosRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	@RequestMapping("/usuario")
	public String getUsuarios(Model model) {
		model.addAttribute("usuariosList", this.usuarioRepository.findAll());
		return "usuario";
	}
	
}
