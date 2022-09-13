package lista05exercicio03;

public class IngressoVip extends Ingresso {
	private int valorAdicional;
	private String localizacao;
	private int calculo;
	
	public IngressoVip(int valor, String tipo, int valorAdicional, String localizacao) {
		super(valor, tipo);
		this.valorAdicional = valorAdicional;
		this.localizacao=localizacao;
	}
	
	
	private void calcularValorIngressoVip() {
			this.calculo=this.valor+this.valorAdicional;
			System.out.println("O valor total do ingresso vip é:"+this.calculo);
	}
	
	public void imprimirDadosIngresso(){
		super.imprimirDadosIngresso();
		 calcularValorIngressoVip();
		System.out.println("A atual localizacao do evento é:"+this.localizacao);
	}
	
	
	
	
}
