package lista04exercicio05;

public class Local {
	private String nomeLocal;
	private int capacidadeMaxima;
	Endereco endereco;
	
	public Local(String nomeLocal, int capacidadeMaxima, Endereco endereco) {

		this.nomeLocal = nomeLocal;
		this.capacidadeMaxima = capacidadeMaxima;
		this.endereco = endereco;
	}

	public String getNomeLocal() {
		return nomeLocal;
	}

	public void setNomeLocal(String nomeLocal) {
		this.nomeLocal = nomeLocal;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
