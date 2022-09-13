package aula01;
import java.util.Scanner;
public class exercicio03 {
	public static void main(String[]args) {
		Scanner entradaTeclado=new Scanner(System.in);
		
		int numero;
		int numero2;
		int numero3;
		int maior;
		
		System.out.println("Informe um numero:");
		numero=entradaTeclado.nextInt();
			maior=numero;
		
		System.out.println("Informe o segundo número:");
		numero2=entradaTeclado.nextInt();
		if (numero2>maior)
				maior=numero2;
		System.out.println("Informe o terceiro número:");
		numero3=entradaTeclado.nextInt();
		if (numero3>maior)
				maior=numero3;
		System.out.printf("Maior numero %d:",maior);
		
		entradaTeclado.close();
		}
	}

