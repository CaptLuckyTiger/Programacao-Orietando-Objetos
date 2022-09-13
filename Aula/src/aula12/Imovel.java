package aula12;

public class Imovel {
		protected String endereco;
		protected double valorBase;
	
		public Imovel(String endereco, double valorBase) {
	
			this.endereco = endereco;
			this.valorBase = valorBase;
		}
		
	public void imprimirDados() {
		System.out.println("Endereco "+this.endereco);
		System.out.println("Valor Base "+this.valorBase);
		System.out.println("");
	}
		

}
