package aula01;
import java.util.Scanner;
public class exercio05bhaskara {

public static void main(String[]args) {
	Scanner entradaTeclado=new Scanner(System.in);
	int a;
	int b;
	int c;
	double raizcaulculo;
	double raizfinal;
	double x1;
	double x2;
	
	
	System.out.println("Digite o valor de a:");
	a=entradaTeclado.nextInt();
	System.out.println("Digite o valor de b:");
	b=entradaTeclado.nextInt();
	System.out.println("Digite o valor de c:");
	c=entradaTeclado.nextInt();
	
	raizcaulculo=(b*b)-4*a*c;
	//System.out.printf("O valor da raiz é %.2f:",raizcaulculo);
	raizfinal=Math.sqrt(raizcaulculo);

	 if(raizfinal>=0)
	 {		x1=(raizfinal-b)/(2*a);
			x2=(raizfinal+b)/(2*a);
			System.out.printf("Digite o valor de x1 é %f:",x1);
			System.out.printf("Digite o valor de x2 é %f:",x2);
	 }
	else
		System.out.println("Não a raiz válida:");
	 	
	 	entradaTeclado.close();

}
	
}

