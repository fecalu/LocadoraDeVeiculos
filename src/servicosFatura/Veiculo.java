package servicosFatura;

import entities.enums.CategoriaVeiculos;

public class Veiculo {
	private CategoriaVeiculos veiculo;
	private String placa;
	private String marca;
	private int ano;
	
	
	public Veiculo(CategoriaVeiculos veiculo) {
		this.veiculo = veiculo;
	}
	

	public Veiculo(CategoriaVeiculos veiculo, String placa, String marca, int ano) {
		super();
		this.veiculo = veiculo;
		this.placa = placa;
		this.marca = marca;
		this.ano = ano;
	}


	public CategoriaVeiculos getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(CategoriaVeiculos veiculo) {
		this.veiculo = veiculo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}






	
	
	
}
