package notebooks;

public class Teste {
	public static void main(String[]args) {
		 
		Notebook notebook1=new Notebook(); 
		Notebook notebook2=new Notebook();
		Notebook notebook3=new Notebook();
		
		 
		notebook1.marca="Acer";
		notebook1.modelo="Aspire3";
		notebook1.armazenamento=1900.00;
		notebook1.memoria_ram=9.8;
		notebook1.modelo_processador="Intel Core I770U";
		notebook1.polegada_da_tela=14.5;
		
		notebook2.marca="Samsung";
		notebook2.modelo="Book";
		notebook2.armazenamento=1500.00;
		notebook2.memoria_ram=8.5;
		notebook2.modelo_processador="Intel Core i5-1135G7";
		notebook2.polegada_da_tela=15.6;
		
		notebook3.marca="Lenovo";
		notebook3.modelo="IdeaPad 3";
		notebook3.armazenamento=256;
		notebook3.memoria_ram=8.3;
		notebook3.modelo_processador="Ryzen 7 5700U ";
		notebook3.polegada_da_tela=15;
		
		System.out.println("Notebook1");
		System.out.println(notebook1.marca);
		System.out.println(notebook1.modelo);
		System.out.println(notebook1.modelo_processador);
		System.out.printf("HD/SSD:%.2f:TB",notebook1.armazenamento);
		System.out.printf("\nRAM:%.2f:GB",notebook1.memoria_ram);
		System.out.printf("\nTela:%.2f ",notebook1.polegada_da_tela);
		System.out.println("\n=========================================================================");
		
		System.out.println("Notebook2");
		System.out.println(notebook2.marca);
		System.out.println(notebook2.modelo);
		System.out.println(notebook2.modelo_processador);
		System.out.printf("HD/SSD:%.2f:GB",notebook2.armazenamento);
		System.out.printf("\nRAM:%.2f:GB ",notebook2.memoria_ram);
		System.out.printf("\nTela:%.2f ",notebook2.polegada_da_tela);
		
		System.out.println("\n=========================================================================");
		
		System.out.println("Notebook3");
		System.out.println(notebook3.marca);
		System.out.println(notebook3.modelo);
		System.out.println(notebook3.modelo_processador);
		System.out.printf("HD/SSD:%.2f:TB",notebook3.armazenamento);
		System.out.printf("\nRAM:%.2f:GB",notebook3.memoria_ram);
		System.out.printf("\nTela:%.2f ",notebook3.polegada_da_tela);
	
	
	}
	
	

}
