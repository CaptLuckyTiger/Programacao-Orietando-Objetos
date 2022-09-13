package lista02exercicio3;

public class NotebookTeste {
	public static void main(String[]args)
	{
		Notebook notebook1=new Notebook(); 
		//Notebook notebook2=new Notebook();
		//Notebook notebook3=new Notebook();
	
	
		
		notebook1.marca="Acer";
		notebook1.modelo="Aspire3";
		notebook1.HD_SSD=1900;
		notebook1.RAM=9;
		notebook1.modelo_processador="Intel Core I770U";
		notebook1.polegadas_tela=14.5;
	
		
	 
		 notebook1.ligar();
		 notebook1.desligar(); 
		 notebook1.conectar_internet();
		 
	
      System.out.println(notebook1);
       
		//notebook1.imprimirDados();
        
	
	
	
	}
}
