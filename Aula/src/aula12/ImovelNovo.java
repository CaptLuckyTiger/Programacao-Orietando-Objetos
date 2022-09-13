package aula12;

public class ImovelNovo extends Imovel {
	double valorAdicional;

	public ImovelNovo(String endereco, double valorBase, double valorAdicional) {
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimirDados() {
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
}
