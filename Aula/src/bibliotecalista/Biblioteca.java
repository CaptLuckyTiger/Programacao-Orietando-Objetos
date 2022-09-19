package bibliotecalista;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private List <Livro> listaLivros;
	
	public Biblioteca() {
		
		this.listaLivros = new ArrayList <Livro> ();
	}
		
	public void cadastrarNovosLivros(int codigo, String titulo, String autor, String editora, 
			int numPaginas, int anoPublicacao) {
				
		Livro livro = new Livro (codigo, titulo, autor, editora, numPaginas, anoPublicacao);
		this.listaLivros.add(livro);
		System.out.println("Livro " + titulo + " adicionado com sucesso!");
			
	}
			
	public void efetuarEmprestimo(int codigo, String nomeAluno, int diaEmprestimo)  {
				
		boolean check = false; //vari�vel booleana usada para checar se o livro existe na biblioteca
				
		try {
			
			for (Livro livro : listaLivros) {
					
				if (codigo == livro.getCodigo()) {
						
					livro.efetuarEmprestimo(nomeAluno, diaEmprestimo);
					check = true;
					System.out.println("Livro " + livro.getTitulo() + " emprestado com sucesso!");
					System.out.println("");
				}
			}
				
			if (!check) {
				throw new LivroNaoExistenteException();
				//EXCE��O
				//System.out.println("Livro n�o existente na biblioteca!");
					
			}
		} catch (LivroNaoExistenteException lnee) {
			
			System.out.println(lnee.getMessage());
		} catch (LivroNaoDisponivelException lnde) {
			
			System.out.println(lnde.getMessage());
		}
	}
			
		public void efetuarDevolucao(int codigo, int diaDevolucao) {
				
			boolean check = false;
			
			try {
				
				for (Livro livro : listaLivros) {
					
					if (codigo == livro.getCodigo()) {
						
						livro.efetuarDevolucao(diaDevolucao);
						check = true;
						System.out.println("Livro " + livro.getTitulo() + " devolvido com sucesso!");
						System.out.println("");
					}
				}
				
				if (!check) { //EXCE��O
					
					throw new LivroNaoExistenteException();
					//System.out.println("Livro inexistente.");
				}
				
			} catch (LivroNaoEmprestadoException lnde) {
				
				System.out.println(lnde.getMessage());
			} catch (LivroNaoExistenteException lnee) {
				
				System.out.println(lnee.getMessage());
			}
		}
			
		public void verificarSituacao() {
				
			for (Livro livro : listaLivros) {
					
				System.out.println("Dados do livro: ");
				System.out.println("C�digo: " + livro.getCodigo());
				System.out.println("T�tulo: " + livro.getTitulo());
				System.out.println("Autor: " + livro.getAutor());
				System.out.println("Editora: " + livro.getEditora());
				System.out.println("N�mero de p�ginas: " + livro.getNumPaginas());
				System.out.println("Ano de publica��o: " + livro.getAnoPublicacao());
				
				if (livro.isEmprestado()) {
						
					System.out.println("O livro " + livro.getTitulo() + " est� emprestado!");
					System.out.println("Dia do empr�stimo: " + livro.getDiaEmprestimo());
					System.out.println("Aluno que emprestou o livro: " + livro.getNomeAluno());
						
				} else {
						
					System.out.println("O livro " + livro.getTitulo() + " est� dispon�vel!");
				}
					
				System.out.println("");
			}
		}
	
}
