package aula01;
import java.util.Scanner;
public class exercicio04 {
	public static void main(String[]args) {
		Scanner entradaTeclado=new Scanner(System.in);
		double compra;
		double resultado;
		
		System.out.println("Informe o valor da sua compra");
		compra=entradaTeclado.nextInt();
			
			if(compra>50)
				
			resultado=compra*(1-0.10);
				
			else
				resultado=compra*(1-0.05);
			
			System.out.printf("O seu desconto será de:%.2f",resultado);
	
			entradaTeclado.close();
	}

}
