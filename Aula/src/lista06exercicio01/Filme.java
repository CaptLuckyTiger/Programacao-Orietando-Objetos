package lista06exercicio01;

public class Filme {
	private String titulo;
	private String duracao;
	

	public Filme(String titulo, String duracao) {
		
		this.titulo = titulo;
		this.duracao = duracao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	
}	
