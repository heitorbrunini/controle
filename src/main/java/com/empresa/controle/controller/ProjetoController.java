package com.empresa.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.controle.entities.Projeto;
import com.empresa.controle.repository.ProjetoRepository;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {
	
	@Autowired
	private ProjetoRepository repository;
	
	@GetMapping	
	public List<Projeto> getFuncionarios() {
		return repository.findAll();
	}
	
	@PostMapping
	public String postFuncionarios(Projeto f) {
		if(f != null) {
			repository.save(f);
			return "sucesso inserido com sucesso";
		}		
		return "Projeto não inserido, tente novamente";
	}
	
	@DeleteMapping("/{id}")
	public String deleteFuncionariosById(@PathVariable Long id) {
		repository.deleteById(id);
		return "Projeto deletado com sucesso";
	}
	
	
	

}
