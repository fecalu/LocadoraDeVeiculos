package Entidades;

import java.time.LocalDate;

public class Pj extends Pessoa {
	private String cnpj;

	
	public Pj() {
		
	}
	public Pj(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public Pj(String nome, LocalDate dataNascimento, String cnpj) {
		super(nome, dataNascimento);
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	public boolean validaCnpj(String cnpj) {
		if (cnpj.length() != 14) {
            return false;
        }
		return true;
	}
		
	
}
