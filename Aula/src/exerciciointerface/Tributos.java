package exerciciointerface;

public class Tributos {

private double valorMercadoria;
private Taxas taxas;

public Tributos(double valorMercadoria, Taxas taxas) {
	this.valorMercadoria = valorMercadoria;
	this.taxas = taxas;
}

	public void calcularProduto() {
		double valorTotalProduto=this.valorMercadoria+this.taxas.calcularTaxas(valorMercadoria);	
		
		System.out.println("Valor total R$:"+valorTotalProduto);
	}

}
