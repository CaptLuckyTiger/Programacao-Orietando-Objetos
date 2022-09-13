package lista04exercicio05;

public class IngressoTeste {
	public static void main(String[]args) {
		
		Endereco endereco1=new Endereco("Rua Leupodo Cerra",971,"Andorinhas","Leupodina","AM");
		
		Local local1=new Local("Quebra Ossos",300,endereco1);
		
		Artista artista1=new Artista("MALCON","LATINO","CANTOR AOS 19 ANOS",local1);
		
		Ingressos ingresso1=new Ingressos("Mixxen Eletronic","09/11/1958",19,artista1);
		
		ingresso1.venderIngressos(400);
		System.out.println("==========================");
		ingresso1.emitirRelatorio();
	}
}
