package servicoTaxa;

import java.time.Duration;

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
		
		double minutos = Duration.between(aluguelCliente.getDataInicial(), aluguelCliente.getDatafFinal()).toMinutes();
		double horas = minutos / 60.0;
		
		double pagamentoBasico;
		if (horas <= 12) {
			pagamentoBasico = valorPorHora * Math.ceil(horas);
		}
		else {
			pagamentoBasico = valorPorDia * Math.ceil(horas/24);
		}
		
		double taxa = taxaServico.taxaServicoLocaliza(pagamentoBasico);
		
		aluguelCliente.setFaturaCliente(new Fatura(pagamentoBasico, taxa));
		
	}
	
	
	
}
