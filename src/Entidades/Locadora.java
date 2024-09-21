package Entidades;

import java.util.ArrayList;
import java.util.List;

import entities.enums.StatusCliente;

public class Locadora {
	
	private StatusCliente status;
	private String notas;
	private List <Cliente> clientes = new ArrayList<>();
	
	
	
	public Locadora() {
		
	}
	
	public Locadora(StatusCliente status, String notas, List<Cliente> cliente) {
		super();
		this.status = status;
		this.notas = notas;
		this.clientes = cliente;
	}

	public StatusCliente getStatus() {
		return status;
	}

	public void setStatus(StatusCliente status) {
		this.status = status;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}
	
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void removeCliente(Cliente cliente) {
		clientes.remove(cliente);
	}
	
	
}
