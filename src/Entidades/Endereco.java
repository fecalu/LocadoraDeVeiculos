package Entidades;

public class Endereco {
	
	private String bairro;
	private String rua;
	private String cidade;
	private String Estado;
	private String cep;
	
	
	public Endereco(String bairro, String rua, String cidade, String estado, String cep) {
		this.bairro = bairro;
		this.rua = rua;
		this.cidade = cidade;
		Estado = estado;
		this.cep = cep;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return Estado;
	}


	public void setEstado(String estado) {
		Estado = estado;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
	
	
}
