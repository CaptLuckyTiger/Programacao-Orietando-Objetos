package lista04exercicio05;

public class Artista {
	private String nome;
	private String nacionalidade;
	private String bibiografia;
	Local local;
	
	public Artista(String nome, String nacionalidade, String bibiografia, Local local) {

		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.bibiografia = bibiografia;
		this.local = local;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getBibiografia() {
		return bibiografia;
	}

	public void setBibiografia(String bibiografia) {
		this.bibiografia = bibiografia;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
	
}
