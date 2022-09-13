package aula09;

public class PessoaTeste {
public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("João da Silva", "25/04/1995", "Masculino", "joao@email.com", EstadoCivil.CASADO, "Vicente Machado", 1024, "Centro", "Ponta Grossa", "PR");
		pessoa1.emitirRelatorio();
		
		pessoa1.getEndereco().setLogradouro("Monteiro Lobado");
		pessoa1.getEndereco().setNumero(512);
		pessoa1.getEndereco().setBairro("Jd. Carvalho");
		
		pessoa1.emitirRelatorio();
		
		Endereco endereco2 = new Endereco("Balduíno Taques", 2048, "Centro", "Ponta Grossa", "PR");
		Pessoa pessoa2 = new Pessoa("Maria de Oliveira", "03/08/1992", "Feminino", "maria@email.com", EstadoCivil.SOLTEIRO, endereco2);
		pessoa2.emitirRelatorio();
	}
}
