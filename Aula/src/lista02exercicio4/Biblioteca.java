package lista02exercicio4;

public class Biblioteca {
	String titulo;
	String autor;
	String editora;
	int PAG;
	int ano_public;
	boolean situacao;

	public void emprestimo() {
		if (!situacao) {
			situacao = true;
			System.out.println("O livro:" + titulo + " " + autor + " " + editora + " " + PAG + " " + ano_public + " "
					+ "foi emprestado");

		} else {

		}
	}

	public void devolucao() {
		if (situacao) {
			situacao = false;
			System.out.println("O livro:" + titulo + " " + autor + " " + editora + " " + PAG + " " + ano_public + " "
					+ "devolvido e est� disponivel para imprestimo:");

		} else {
			System.out.println("O livro j� foi devolvido para emprestar, fa�a uma nova requisi��o");

		}

	}

	public void impressaoDados() {
		System.out.println("================");
		System.out.println("LIVRO:");
		System.out.println("Titulo:" + titulo);
		System.out.println("Autor:" + autor);
		System.out.println("Editora:" + editora);
		System.out.println("P�ginas:" + PAG);
		System.out.println("Ano da publica��o:" + ano_public);
	}
}
