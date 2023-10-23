package com.empresa.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.controle.entities.Funcionario;
import com.empresa.controle.repository.FuncionarioRepository;

@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController {
	
	@Autowired
	private FuncionarioRepository repository;
	
	@GetMapping	
	public List<Funcionario> getFuncionarios() {
		return repository.findAll();
	}
	
	@PostMapping
	public String postFuncionarios(Funcionario f) {
		if(f != null) {
			repository.save(f);
			return "sucesso inserido com sucesso";
		}		
		return "funcionario não inserido, tente novamente";
	}
	
	@DeleteMapping("/{id}")
	public String deleteFuncionariosById(@PathVariable Long id) {
		repository.deleteById(id);
		return "funcionario deletado com sucesso";
	}
	
	
	

}
