package matematica;

import java.util.Scanner;

public class Matematica1 {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
	
		double a,b;
		
		System.out.println("Digite um número>");
		a=scanner.nextDouble();
		System.out.println("Digite um número:");
		b=scanner.nextDouble();
		
		double valormaior= Math.max(a,b);
		
		System.out.println(valormaior);
		
		scanner.close();
		
		
	}
}
