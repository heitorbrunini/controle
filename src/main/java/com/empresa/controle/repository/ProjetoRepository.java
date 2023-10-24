package com.empresa.controle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.controle.entities.Projeto;

public interface ProjetoRepository extends JpaRepository< Projeto,Long> {

}
