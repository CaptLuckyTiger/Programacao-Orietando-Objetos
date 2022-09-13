package lista05exercicio02;

import java.util.Scanner;

public class TestarImovel {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		Imovel imovel=null;
		
		System.out.println("Digite a opção 1 Imovel Novo:");
		System.out.println("Digite a opção 2 Imovel Velho:");
		System.out.println("Opcao ");
		int opcao =input.nextInt();	
		
		switch(opcao) {
			
			case 1:
				imovel=new ImovelVelho("Rua Rubersaval, 2387, Cidade de Alagoas,",950000,100000);
					break;
			case 2:
				imovel=new ImovelNovo("Rua Alberto Ribas,9786754, Cidade de Maraja,",860000,100000);
			
		}
			imovel.imprimirDados();
		
			input.close();
	}
}
