package aula13;

public class ImpressoraTeste {
	public static void main(String[] args) {
			Impressora impressora=null;
			
			//Simulando a escolha do usuario
			
			//impressora=new Laser("Hp","1235");
			
		
			//Simulando a escolha do usuario
			impressora=new JatoDeTinta("Canon","98126");
			
			impressora.imprimir();
			
	}
}
