package servicoTaxa;

import servicosFatura.AluguelDoCliente;
import servicosFatura.Fatura;

public class servicoDeAluguel {
	private double valorPorHora;
	private double valorPorDia;
	
	private TaxaDeServicoLocaliza taxaServico;
	
	



	public servicoDeAluguel(double valorPorHora, double valorPorDia, TaxaDeServicoLocaliza taxaServico) {
		this.valorPorHora = valorPorHora;
		this.valorPorDia = valorPorDia;
		this.taxaServico = taxaServico;
	}


	public double getValorPorHora() {
		return valorPorHora;
	}





	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}





	public double getValorPorDia() {
		return valorPorDia;
	}





	public void setValorPorDia(double valorPorDia) {
		this.valorPorDia = valorPorDia;
	}





	public TaxaDeServicoLocaliza getTaxaServico() {
		return taxaServico;
	}





	public void setTaxaServico(TaxaDeServicoLocaliza taxaServico) {
		this.taxaServico = taxaServico;
	}





	public void processoDeFatura(AluguelDoCliente aluguelCliente) {
		
		
		aluguelCliente.setFaturaCliente(new Fatura(50.0, 10));
		
	}
	
	
	
}
