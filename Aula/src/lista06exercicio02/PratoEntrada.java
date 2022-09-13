package lista06exercicio02;

public class PratoEntrada  {
	
	private String nome;
	private String numero;
	private  String ingredientes;
	private double prato;
	
	public PratoEntrada(String nome, String numero, String ingredientes, double prato) {
		this.nome = nome;
		this.numero = numero;
		this.ingredientes = ingredientes;
		this.prato = prato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public double getprato() {
		return prato;
	}

	public void setprato(double prato) {
		this.prato = prato;
	}
	
	


	
}
