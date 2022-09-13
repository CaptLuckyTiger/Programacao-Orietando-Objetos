package lista05exercicio02;

public class ImovelVelho extends Imovel {
	protected int desconto;
	private int calculoV;
	
	public ImovelVelho(String endereco, int valorBase, int desconto) {
		super(endereco, valorBase);
		this.desconto = desconto;
	}

	
	public void imprimirDados(){
		super.imprimirDados();
		System.out.println("Desconto:"+this.desconto);
		calcularDesconto();
	}
	
	public void calcularDesconto() {
		calculoV=this.valorBase-this.desconto;
		System.out.println("O valor do desconto "+this.calculoV);
	}
}
