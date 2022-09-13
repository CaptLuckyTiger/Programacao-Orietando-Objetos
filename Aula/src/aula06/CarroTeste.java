package aula06;

import java.util.Scanner;

public class CarroTeste {

	public static void main(String[]args) {
	 Carro carro1=new  Carro("Civic","Honda",2022,"ABC-1234","Preto");
	 Carro carro2=new  Carro("Gol","Volkswagen",2015,"ABC-2432","Azul");
	// classecarroexemplo carro3=new  classecarroexemplo();
	 
	 Scanner entradaTeclado=new Scanner(System.in);
	
	/* System.out.println("Informe o modelo do carro:");
	 carro1.modelo=entradaTeclado.nextLine();
	 
	 System.out.println("Informe a marca:");
	 carro1.marca=entradaTeclado.nextLine();
	
	 System.out.println("Informe o ano:");
	 carro1.ano=entradaTeclado.nextInt();
	 
	 entradaTeclado.nextLine();
	 
	 System.out.println("Informe a placa:");
	 carro1.placa=entradaTeclado.nextLine();
	 
	 System.out.println("Informe a cor:");
	 carro1.cor=entradaTeclado.nextLine(); */
	 
	 
	 
	 
	 
	/* carro1.modelo="Civic";
	 carro1.marca="Honda";
	 carro1.ano=2022;
	 carro1.placa="ABC-1234";
	 carro1.cor="Azul";
	 */
	 
	/* carro2.modelo="Gol";
	 carro2.marca="Volkswagen";
	 carro2.ano=2015;
	 carro2.placa="ABC-2432";
	 carro2.cor="Preto";
	 */
	 
	/* System.out.println("Carro 1");
	 System.out.println(carro1.modelo);
	 System.out.println(carro1.marca);
	 System.out.println(carro1.ano);
	 System.out.println(carro1.placa);
	 System.out.println(carro1.cor);
	 System.out.println("==============================================");
	 System.out.println("Carro 2");
	 System.out.println(carro2.modelo);
	 System.out.println(carro2.marca);
	 System.out.println(carro2.ano);
	 System.out.println(carro2.placa);
	 System.out.println(carro2.cor); */
	 
	 carro1.ligar();
	 carro1.ligar();
	 carro1.acelerar();
	 carro1.acelerar();
	 carro1.frear();
	 carro1.frear();
	 carro1.frear();
	
	System.out.println(carro1.modelo);
	System.out.println(carro1.marca);
	System.out.println(carro1.ano);
	System.out.println(carro1.placa);
	System.out.println(carro1.cor);

	
	System.out.println(carro2.modelo);
	System.out.println(carro2.marca);
	System.out.println(carro2.ano);
	System.out.println(carro2.placa);
	System.out.println(carro2.cor);
	// System.out.println(carro1);

	// carro1.imprimirDados();
	 
	 entradaTeclado.close();
	
	}
}
