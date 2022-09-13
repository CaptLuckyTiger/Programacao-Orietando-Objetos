package lista05exercicio02;

public class Imovel {
	
	protected String endereco;
	protected int valorBase;
	
	public Imovel(String endereco, int valorBase) {
		this.endereco = endereco;
		this.valorBase = valorBase;
	}
	
	public void imprimirDados(){
		System.out.println("Endereco:"+this.endereco);
		System.out.println("Valor Base:"+this.valorBase);
	}
	
	
}
