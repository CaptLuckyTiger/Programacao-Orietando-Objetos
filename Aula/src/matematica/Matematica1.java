package matematica;

import java.util.Scanner;

public class Matematica1 {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
	
		double a,b;
		
		System.out.println("Digite um n�mero>");
		a=scanner.nextDouble();
		System.out.println("Digite um n�mero:");
		b=scanner.nextDouble();
		
		double valormaior= Math.max(a,b);
		
		System.out.println(valormaior);
		
		scanner.close();
		
		
	}
}
