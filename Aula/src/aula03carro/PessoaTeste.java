package aula03carro;

public class PessoaTeste {
	public static void main(String[]args) {
		Pessoa funcao=new Pessoa();
		Pessoa funcao2=new Pessoa();
		Pessoa funcao3=new Pessoa();
		
	
		funcao.Nome="João"; 
		funcao.Idade=25;
		funcao.Peso=68.5;
	 
		funcao2.Nome="Maria";
		funcao2.Idade=30;
		funcao2.Peso=55.6;
		
		funcao3.Nome="José";
		funcao3.Idade=32;
		funcao3.Peso=62.4;
		
		 System.out.println("Pessoa 1");
		 System.out.println(funcao.Nome);
		 System.out.println(funcao.Idade);
		 System.out.println(funcao.Peso);
		 System.out.println("==============================");
		 System.out.println("Pessoa 2");
		 System.out.println(funcao2.Nome);
		 System.out.println(funcao2.Idade);
		 System.out.println(funcao2.Peso);
		 System.out.println("==============================");
		 System.out.println("Pessoa 3");
		 System.out.println(funcao3.Nome);
		 System.out.println(funcao3.Idade);
		 System.out.println(funcao3.Peso); 
		 
		 funcao.comer();
		 funcao.andar();
		 funcao.falar();
		 
		 funcao2.comer();
		 funcao2.andar();
		 funcao2.falar();
		 
		 funcao3.comer();
		 funcao3.andar();
		 funcao3.falar();
	
		 System.out.println(funcao);
	
	}
	
	


}
