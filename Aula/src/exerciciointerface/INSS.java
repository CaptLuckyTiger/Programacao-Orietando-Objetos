package exerciciointerface;

public class INSS implements Taxas {

	@Override
	public double calcularTaxas(double valorMercadoria) {
		
		return 0.11*(valorMercadoria);
	}
	
}
