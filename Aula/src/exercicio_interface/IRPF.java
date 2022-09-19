package exercicio_interface;

public class IRPF implements Taxas{

	@Override
	public double calcularTaxas(double valorMercadoria) {
		
		return 0.075*(valorMercadoria);
	}

	
	
}
