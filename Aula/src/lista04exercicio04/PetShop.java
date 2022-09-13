package lista04exercicio04;

public class PetShop {
	private String descricao;
	private String dataInicio;
	private Animal animal;

	public PetShop(Animal animal) {
		this.animal = animal;
	}

	public void tratamento(String descricao, String dataInicio) {

		this.descricao = descricao;
		this.dataInicio = dataInicio;

		System.out.println("O tratamento do seu animal é:" + this.descricao);
		System.out.println("a Data inicio do tratamento é:" + this.dataInicio);

	}

	public void emitirDados() {
		System.out.println("Informações do animal");
		System.out.println("Nome do animal:" + this.animal.getNome());
		System.out.println("Idade dao animal:" + this.animal.getIdade());
		System.out.println("Sexo do animal:" + this.animal.getSexo());
		System.out.println("===============================");
		System.out.println("Informçãções do dono");
		System.out.println("Nome:" + this.animal.getDono().getNome());
		System.out.println("CPF:" + this.animal.getDono().getCpf());
		System.out.println("EMAIL:" + this.animal.getDono().getEmail());
		System.out.println("Telefone:" + this.animal.getDono().getTelefone());
		System.out.println("===============================");
		System.out.println("Endereco do dono");
		System.out.println("Logadouro:" + this.animal.getDono().getEndereco().getLogadouro());
		System.out.println("Numero da casa:" + this.animal.getDono().getEndereco().getNumero());
		System.out.println("Bairro:" + this.animal.getDono().getEndereco().getBairro());
		System.out.println("Cidade:" + this.animal.getDono().getEndereco().getCidade());
		System.out.println("Unidade Federativa:" + this.animal.getDono().getEndereco().getUnidadeFederativa());

	}
}
