package exerciciointerface;

public class IOF implements Taxas{

	@Override
	public double calcularTaxas(double valorMercadoria) {
	
		return 0.06*(valorMercadoria);
	}

}
