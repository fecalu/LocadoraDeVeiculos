package Entidades;

import java.time.LocalDate;

public class Pf extends Pessoa {
	private String cpf;
	
	
	
	
	
	public Pf() {
		
	}

	public Pf(String cpf) {
		super();
		this.cpf = cpf;
	}

	public Pf(String nome, LocalDate dataNascimento, String cpf) {
		super(nome, dataNascimento);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	public boolean validarCpf(String cpf) {
		if (cpf.length() == 11) {
			return true;
		}
		
		return false;
	}
	
	
}
