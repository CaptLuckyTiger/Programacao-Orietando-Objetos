package lista05exercicio03;

public class IngressoNormal extends Ingresso {
	
	public IngressoNormal(int valor, String tipo) {
		super(valor, tipo);
	}
	


	public void imprimirDadosIngresso() {
		super.imprimirDadosIngresso();
		System.out.println("Ingresso normal: "+this.valor+" "+this.tipo+" ");
	}
}	
