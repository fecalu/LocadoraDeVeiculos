package servicoTaxa;

public class TaxaDeServicoLocaliza {
	
	public double taxaServicoLocaliza(double quantidade) {
		if (quantidade <= 100) {
			return quantidade * 0.2;
		}
		else {
			return quantidade * 0.15;
		}
			
	}
	
	
	
}
