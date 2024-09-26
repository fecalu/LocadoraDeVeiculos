package servicoTaxa;

public class TaxaDeServicoLocaliza implements TaxaDeServico {
	
	public double taxa(double quantidade) {
		if (quantidade <= 100) {
			return quantidade * 0.2;
		}
		else {
			return quantidade * 0.15;
		}
			
	}


	
	
	
}
