package lista06exercicio01;

public class Sala {
	public int indentificao; //numero da cadeira
	public int capacidadeMaxima;
	private Filme filme;

	public Sala(int indentificao, int capacidadeMaxima, Filme filme) {
		this.indentificao = indentificao;
		this.capacidadeMaxima = capacidadeMaxima;
		this.filme = filme;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public int getIndentificao() {
		return indentificao;
	}

	public void setIndentificao(int indentificao) {
		this.indentificao = indentificao;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	
}
