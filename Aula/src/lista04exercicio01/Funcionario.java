package lista04exercicio01;

public class Funcionario {
	private int numeroRegistro;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private int telefone;
	private Endereco endereco;
	
	public Funcionario(int numeroRegistro, String nome, String dataNascimento, String sexo, String setor, int telefone,
			String logadouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.endereco=new Endereco(logadouro,numero,bairro,cidade,unidadeFederativa);
	}
	

	public Funcionario(int numeroRegistro, String nome, String dataNascimento, String sexo, String setor, int telefone,
			Endereco endereco) {
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.endereco = endereco;
	}


	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
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

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void emitirRelatorio() {
		System.out.println("Numero Registro: " +this.numeroRegistro);
		System.out.println("Nome: " +this.nome);
		System.out.println("Data Nascimento: "+this.dataNascimento);
		System.out.println("Sexo: "+this.sexo);
		System.out.println("Setor: " +this.setor);
		System.out.println("Telefone: " +this.telefone);
		System.out.println("Logadouro: " +this.endereco.getLogadouro());
		System.out.println("Numero: " +this.endereco.getNumero());
		System.out.println("Bairro: "+this.endereco.getBairro());
		System.out.println("Cidade: " +this.endereco.getCidade());
		System.out.println("Unidade Federativa: " +this.endereco.getUnidadeFederativa());
		
		
		
		
		
		
		
		
		
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
}
