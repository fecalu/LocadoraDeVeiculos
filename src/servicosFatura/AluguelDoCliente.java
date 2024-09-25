package servicosFatura;

import java.time.LocalDateTime;

public class AluguelDoCliente {
	
	private LocalDateTime dataInicial;
	private LocalDateTime datafFinal;
	
	private Fatura faturaCliente;
	private Veiculo veiculoCliente;
	
	
	
	public AluguelDoCliente(LocalDateTime dataInicial, LocalDateTime datafFinal, Veiculo veiculoCliente) {

		this.dataInicial = dataInicial;
		this.datafFinal = datafFinal;
		this.veiculoCliente = veiculoCliente;
	}



	public LocalDateTime getDataInicial() {
		return dataInicial;
	}



	public void setDataInicial(LocalDateTime dataInicial) {
		this.dataInicial = dataInicial;
	}



	public LocalDateTime getDatafFinal() {
		return datafFinal;
	}



	public void setDatafFinal(LocalDateTime datafFinal) {
		this.datafFinal = datafFinal;
	}



	public Fatura getFaturaCliente() {
		return faturaCliente;
	}



	public void setFaturaCliente(Fatura faturaCliente) {
		this.faturaCliente = faturaCliente;
	}



	public Veiculo getVeiculoCliente() {
		return veiculoCliente;
	}



	public void setVeiculoCliente(Veiculo veiculoCliente) {
		this.veiculoCliente = veiculoCliente;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
