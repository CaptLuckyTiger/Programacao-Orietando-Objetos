package interfaces;

public class CarrinhoCompraTeste {
	public static void main(String[] args) {
		
		//Correios correios=new Correios();
		//Sedex sedex=new Sedex();
		//Transportadora transportadora=new Transportadora();
		
		CarrinhoCompra carrinhocompra=new CarrinhoCompra(500.00,100,new Transportadora());
		carrinhocompra.realizarCompra();

	}
}
