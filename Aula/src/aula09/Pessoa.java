package aula09;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String email;
	
	private EstadoCivil estadoCivil;
	private Endereco endereco;
	
	public Pessoa(String nome, String dataNascimento, String sexo, String email, 
			EstadoCivil estadoCivil, String logradouro, int numero, String bairro, 
			String cidade, String unidadeFederativa) {
		
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.endereco = new Endereco(logradouro, numero, bairro, cidade, unidadeFederativa);
	}
	
	public Pessoa(String nome, String dataNascimento, String sexo, String email, 
			EstadoCivil estadoCivil, Endereco endereco) {
		
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.endereco = endereco;
	}
	
	public void emitirRelatorio() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("E-mail: " + this.email);
		System.out.println("Estado Civil: " + this.estadoCivil.getEstado());
		System.out.println("Logradouro: " + this.endereco.getLogradouro());
		System.out.println("Número: " + this.endereco.getNumero());
		System.out.println("Bairro: " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("UF: " + this.endereco.getUnidadeFederativa());
	}

	public Endereco getEndereco() {
		return endereco;
	}
}
