package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import servicosFatura.AluguelDoCliente;

public class Cliente {
	
	
	private LocalDate dataDoCadastro;
	private String telefone;
	private String email;
	private Pessoa pessoa;
	
	private List<AluguelDoCliente> alugueis = new ArrayList<>();
	
	
	public Cliente() {
		
	}

	public Cliente(LocalDate dataDoCadastro, String telefone, String email, Pessoa pessoa) {
		this.dataDoCadastro = dataDoCadastro;
		this.telefone = telefone;
		this.email = email;
		this.pessoa = pessoa;
	}
	

	public LocalDate getDataDoCadastro() {
		return dataDoCadastro;
	}
	public void setDataDoCadastro(LocalDate dataDoCadastro) {
		this.dataDoCadastro = dataDoCadastro;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
	public void addAluguei(AluguelDoCliente aluguel) {
		this.alugueis.add(aluguel);
	}
	
	public void removeAluguei(AluguelDoCliente aluguel) {
		this.alugueis.remove(aluguel);
	}
}
