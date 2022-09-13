package lista05exercicio03;

public class IngressoTeste {
	public static void main(String[] args) {
		CamaroteSuperior ingresso=new CamaroteSuperior(950,"VIP",44,"Rua Afonso Pena");
		CamaroteInferior ingresso1=new CamaroteInferior(550,"VIP",35,"Rua Afonso Pena");
		IngressoNormal ingresso2=new IngressoNormal(350,"Normal");
		
		ingresso.imprimirDadosIngresso();
		ingresso1.imprimirDadosIngresso();
		ingresso2.imprimirDadosIngresso();
		
	}
}
