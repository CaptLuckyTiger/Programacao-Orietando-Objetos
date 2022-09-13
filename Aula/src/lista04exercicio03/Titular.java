package lista04exercicio03;

public class Titular {
	private int cpf;
	private int rg;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private int rendaMensal;
	private Endereco endereco;
	
	public Titular(int cpf, int rg, String nome, String dataNascimento, String sexo, int rendaMensal,Endereco endereco)
		{
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.rendaMensal = rendaMensal;
		this.endereco = endereco;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(int rendaMensal) {
		this.rendaMensal = rendaMensal;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
