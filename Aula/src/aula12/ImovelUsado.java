package aula12;

public class ImovelUsado extends Imovel {
	double valorDesconto;

	public ImovelUsado(String endereco, double valorBase, double valorDesconto) {
		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}
	public void imprimirDados() {
		
	}
}
