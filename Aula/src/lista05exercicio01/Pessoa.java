package lista05exercicio01;

public class Pessoa {
	protected String nome;
	protected String dataNascimento;
	protected long rg;
	protected long cpf;

	public Pessoa(String nome, String dataNascimento, long rg, long cpf) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public long getRg() {
		return rg;
	}



	public void setRg(long rg) {
		this.rg = rg;
	}



	public long getCpf() {
		return cpf;
	}



	public void setCpf(long cpf) {
		this.cpf = cpf;
	}



	public void imprimirDados() {
		System.out.println("Nome:"+this.nome);
		System.out.println("Data Nascimento:"+this.dataNascimento);
		System.out.println("RG:"+this.rg);
		System.out.println("CPF:"+this.cpf);
	
	}
	
}
