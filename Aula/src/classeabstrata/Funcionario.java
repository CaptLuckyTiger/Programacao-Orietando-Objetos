package classeabstrata;

public abstract class  Funcionario {
	protected String nome;
	protected long cpf;
	protected Double salarioBase;
	
	
	

	public Funcionario(String nome, long cpf, Double salarioBase) {
		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	}




	public abstract Double calcularSalario();
}
