package aula01;

import java.util.Scanner;
public class exercicio02 {
	public static void main(String[]args) {
		Scanner entradaTeclado=new Scanner(System.in);
		
		String nome;
		String sexo;
		String estado;
		String escolaridade;
		int  filhos;
		double renda;
		
		System.out.println("Informe seu nome:");
		nome=entradaTeclado.nextLine();
		
		System.out.println("Informe seu sexo:");
		sexo=entradaTeclado.nextLine();
		
		System.out.println("Informe seu estado civil:");
		estado=entradaTeclado.nextLine();
		
		System.out.println("Informe quantos filhos tem:");
		filhos=entradaTeclado.nextInt();
		
		entradaTeclado.nextLine();
		
		System.out.println("Informe seu escolaridade:");
		escolaridade=entradaTeclado.nextLine();
		
		System.out.println("Informe seu renda mensal:");
		renda=entradaTeclado.nextDouble();
		
		System.out.println(nome+ " possui sexo: " +sexo+ " estado civil: " +estado+ " Com quantidade de filhos: "+filhos+ " Com escolaridade: " +escolaridade+ " Com renda mensal: "+renda );
		
		
		
		entradaTeclado.close();
		
		
		
	}

}
