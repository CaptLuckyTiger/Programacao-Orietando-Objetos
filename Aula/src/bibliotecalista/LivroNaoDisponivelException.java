package bibliotecalista;

public class LivroNaoDisponivelException extends Exception {
	
	public LivroNaoDisponivelException() {
		
		super("Livro n�o est� dispon�vel para empr�stimo no momento! EXCE��O");
	}

}
