package lista05exercicio05;

public class ColaboradorTeste {
	public static void main(String[] args) {
		
		Empresa empresa1=new Empresa("AFK Johns","Rua Alberto Ribas","09/11/2022",34,"Adminstrativo",878723119);
		empresa1.Imprimirdados();
		System.out.println("===================================");
		Autonomo autonomo1=new Autonomo("JAY CDS","Fransciso Cavalcante","11/03/2016",25,"Vendas",9781102);
		autonomo1.Imprimirdados();
		System.out.println("===================================");
		Estagiario estagiario1=new Estagiario("Jose","Rua Escobar lima","02/03/2017","Progamador",1500.0,7676123);
		estagiario1.Imprimirdados();
		System.out.println("===================================");
		Empregado empregado1=new Empregado("João","Rua Riba Fausto","02/03/2008","Segurança",3500.0,27812355);
		empregado1.Imprimirdados();
	}
}
