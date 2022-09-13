package lista05exercicio02;

public class ImovelNovo extends Imovel {
	protected int valorAdicional;
	private int calculoM;

	public ImovelNovo(String endereco, int valorBase, int valorAdicional) {
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimirDados(){
		super.imprimirDados();
		System.out.println("Valor adicional:"+this.valorAdicional);
		calcularAcrescimo();
	}
	
	public void calcularAcrescimo() {
		calculoM=this.valorBase+this.valorAdicional;
		System.out.println("O valor do ascrescimo: "+this.calculoM);
	}
}
