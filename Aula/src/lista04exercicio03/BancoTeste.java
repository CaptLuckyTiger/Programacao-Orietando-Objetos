package lista04exercicio03;

public class BancoTeste {
	public static void main(String[]args) {
		
		Endereco endereco1=new Endereco("Rua Jose Alencar",972,"Explas","Ponta Grossa","PR");
		Titular titular1=new Titular(9971254,788825,"Astolfo","09/11/2000","Masculino",950,endereco1);
		Banco banco1=new Banco(711,titular1,4500);
		
		banco1.emitirRelatorio();
		banco1.depositar(500);
		banco1.sacar(100);
		banco1.sacar(9000);
	}
}
