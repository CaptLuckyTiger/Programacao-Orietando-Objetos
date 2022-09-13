package aula01;

import java.util.Scanner;
public class aula001 {
		public static void main(String[]args) {
			Scanner entradaTeclado=new Scanner(System.in);
			String nome;
			int idade;
			double peso;
			
			System.out.println("Informe seu nome");
			nome=entradaTeclado.nextLine();
			
			entradaTeclado.nextLine();
			
			System.out.println("Informe sua idade:");
			idade=entradaTeclado.nextInt();
			
			System.out.println("Informe seu peso:");
			peso=entradaTeclado.nextDouble();
			
			System.out.println(nome+ " possui "+ idade+ " anos e " +peso+ " kg " );
			
	
			entradaTeclado.close();
		}
	
	
		
}
