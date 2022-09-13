package lista02exercicio2;

public class RegistroTeste {
	public static void main(String[]args) {
		
		RegistroPessoas Pessoa=new RegistroPessoas();
		//RegistroPessoas Pessoa2=new RegistroPessoas();
		//RegistroPessoas Pessoa3=new RegistroPessoas();
		//RegistroPessoas Pessoa4=new RegistroPessoas();
		
		Pessoa.nome="João";
		Pessoa.sexo="Masculino";
		Pessoa.cpf=133.600;
		Pessoa.idade=18;
		Pessoa.altura=1.93;
		Pessoa.peso=75.5;
		
		Pessoa.andar();
		Pessoa.correr();
		Pessoa.dormir();
		Pessoa.falar();
	
		
	}
	
}

