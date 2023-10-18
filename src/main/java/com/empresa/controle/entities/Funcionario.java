package com.empresa.controle.entities;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="funcionario_tb")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long matricula;
	
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="nome")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="number_dpto")
	private Department d;
	
	@ManyToMany
	private ArrayList<Projeto> projetos;
	
	public Funcionario() {
	
	}

	public Funcionario(Long matricula, String cpf, String nome, Department d) {
		this.matricula = matricula;
		this.cpf = cpf;
		this.nome = nome;
		this.d = d;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}
	
	
}
