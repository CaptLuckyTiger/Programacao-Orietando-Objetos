package lista03exercicio1;

public class Cadastro {
	private int numeroRegistro;
	private String nome;
	private int dataNascimento;
	private String sexo;
	private String setor;
	private int telefone;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;

	public Cadastro(int numeroRegistro, String nome, int dataNascimento, String sexo, String setor, int telefone,
			String rua, int numero, String bairro, String cidade, String estado) {
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cadastro [numeroRegistro=" + numeroRegistro + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", sexo=" + sexo + ", setor=" + setor + ", telefone=" + telefone + ", rua=" + rua + ", numero="
				+ numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + "]";
	}

}
