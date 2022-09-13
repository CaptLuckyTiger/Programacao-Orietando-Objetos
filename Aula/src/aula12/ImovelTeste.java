package aula12;

public class ImovelTeste {
	public static void main (String[]args) {
		
		ImovelNovo ImovelNovo1=new ImovelNovo ("Vicente Machado,1024 -Centro -Ponta Grossa,Paraná",500000,10000);
		ImovelNovo1.imprimirDados();
		
		
		ImovelUsado imovelusado1=new ImovelUsado("Balduino Taques,512,Centro,Ponta Grossa,Paraná",65000,1000);
		imovelusado1.imprimirDados();
	}
}
