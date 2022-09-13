package vetorlistalivros;

public class BibliotecaTeste {

	public static void main(String[] args) {
		
		Biblioteca bibl = new Biblioteca();
		bibl.cadastrarNovosLivros(123, "Introdu��o a Java", "Vinicius", "Papyrus", 267, 2019);
		bibl.cadastrarNovosLivros(456, "Banco de Dados", "Simone", "UTFPR", 187, 2014);
		bibl.cadastrarNovosLivros(789, "C�lculo 2", "Maria", "Rocco", 500, 2007);
		
		bibl.efetuarEmprestimo(123, "Gabriel", 10);
		bibl.efetuarEmprestimo(1213, "Gabriel", 16); //testando exce��o LIVRO N EXISTENTE
		bibl.efetuarEmprestimo(123, "Maria", 5); //testando exce��o LIVRO N DISPONIVEL
		bibl.efetuarDevolucao(123, 15);
		
		bibl.efetuarDevolucao(456, 21); //testando exce��o LIVRO N EMPRESTADO
		
		bibl.efetuarEmprestimo(789, "Luiz", 21);
		
		bibl.verificarSituacao();
		
	}
}
