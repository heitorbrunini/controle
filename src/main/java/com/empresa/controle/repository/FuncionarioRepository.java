package com.empresa.controle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.controle.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Long>{
	
}