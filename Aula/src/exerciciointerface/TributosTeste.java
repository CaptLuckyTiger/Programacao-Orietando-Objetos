package exerciciointerface;

public class TributosTeste {
	public static void main(String[] args) {
		Tributos tributos=new Tributos(500.00,new IRPF());
		tributos.calcularProduto();
	}
}
