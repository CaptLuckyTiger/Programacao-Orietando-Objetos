package exerciciointerface;

public class IPVA implements Taxas {

	@Override
	public double calcularTaxas(double valorMercadoria) {
		
		return 0.03*(valorMercadoria);
	}

}
