package com.empresa.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.controle.entities.Department;
import com.empresa.controle.repository.DepartmentRepository;

@RestController
@RequestMapping("/departamentos")
public class DepartmentController {
	
	@Autowired
	private DepartmentRepository repository;
	
	@GetMapping	
	public List<Department> getFuncionarios() {
		return repository.findAll();
	}
	
	@PostMapping
	public String postFuncionarios(Department f) {
		if(f != null) {
			repository.save(f);
			return "sucesso inserindo Departamento";
		}		
		return "Department não inserido, tente novamente";
	}
	
	@DeleteMapping("/{id}")
	public String deleteFuncionariosById(@PathVariable Long id) {
		repository.deleteById(id);
		return "Departamento deletado com sucesso";
	}
	
	
	

}
