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
					+ "devolvido e está disponivel para imprestimo:");

		} else {
			System.out.println("O livro já foi devolvido para emprestar, faça uma nova requisição");

		}

	}

	public void impressaoDados() {
		System.out.println("================");
		System.out.println("LIVRO:");
		System.out.println("Titulo:" + titulo);
		System.out.println("Autor:" + autor);
		System.out.println("Editora:" + editora);
		System.out.println("Páginas:" + PAG);
		System.out.println("Ano da publicação:" + ano_public);
	}
}
