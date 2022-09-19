package bibliotecalista;

public class Livro {
	
	//atributos do livro
	private int codigo;
	private String titulo;
	private String autor;
	private String editora;
	private int numPaginas;
	private int anoPublicacao;
	private String nomeAluno;
	private int diaEmprestimo;
	private boolean emprestado;
	private double valorMulta;
	
	
	public Livro(int codigo, String titulo, String autor, String editora, int numPaginas, int anoPublicacao) {
		
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.numPaginas = numPaginas;
		this.anoPublicacao = anoPublicacao;
		
		this.nomeAluno = null;
		this.diaEmprestimo = 0;
		this.emprestado = false;
		this.valorMulta = 0.0;
		
	}
	
	public void efetuarEmprestimo(String nomeAluno, int diaEmprestimo) throws LivroNaoDisponivelException {
		
		if (!emprestado) { //livro dispon�vel
			
			this.nomeAluno = nomeAluno;
			this.diaEmprestimo = diaEmprestimo;
			this.emprestado = true;
		} else { //EXCE��O
			
			throw new LivroNaoDisponivelException();
			//System.out.println("Livro n�o est� dispon�vel para empr�stimo no momento!");
		}
	}
	
	public String getAutor() {
		return autor;
	}

	public String getEditora() {
		return editora;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public double getValorMulta() {
		return valorMulta;
	}

	public void efetuarDevolucao(int diaDevolucao) throws LivroNaoEmprestadoException {
		
		if (emprestado) {
			
			int intervaloDias = diaDevolucao - this.diaEmprestimo;
			this.valorMulta = this.calcularMulta(intervaloDias);
			this.nomeAluno = null;
			this.diaEmprestimo = 0;
			this.emprestado = false;
			this.valorMulta = 0;
			
		} else { //EXCE��O
			
			throw new LivroNaoEmprestadoException();
			//System.out.println("Este livro est� dispon�vel para empr�stimo!");
		}
	}
	
	private double calcularMulta(int intervaloDias) {
		
		if (intervaloDias <= 7) {
			
			System.out.println("N�o h� multas a pagar!");
			return 0.0;
		} else {
			
			double multa = (intervaloDias - 7) * 1.5;
			System.out.println("O valor da multa � R$ " + multa);
			return multa;
			
		}
	}


	public int getCodigo() {
		return codigo;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public int getDiaEmprestimo() {
		return diaEmprestimo;
	}
	
	
	
	
	
	

}
