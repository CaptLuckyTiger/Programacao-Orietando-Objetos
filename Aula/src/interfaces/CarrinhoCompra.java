package interfaces;

public class CarrinhoCompra {
	private double valorProduto;
	private int distancia;
	private Frete frete;

	public CarrinhoCompra(double valorProduto, int distancia,Frete frete) {
		this.valorProduto = valorProduto;
		this.distancia = distancia;
		this.frete=frete;
	}

	public void realizarCompra() {

		double valorTotalCompra = this.valorProduto + this.frete.calcularFrete(this.distancia);
		
		System.out.println("Valor total R$ " + valorTotalCompra);
		}
	}

	

