package vetorlistalivros;

public class LivroNaoEmprestadoException extends Exception {
	
	public LivroNaoEmprestadoException() {
		
		super("Livro est� dispon�vel para empr�stimo, e n�o para devolu��o! EXCE��O");
	}

}
