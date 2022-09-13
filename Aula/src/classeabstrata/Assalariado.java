package classeabstrata;

public class Assalariado extends Funcionario {
	private Double assalariado;

	public Assalariado(String nome, long cpf, double salarioBase, Double assalariado) {
		super(nome, cpf, salarioBase);
		this.assalariado = assalariado;
	}

	@Override
	public Double calcularSalario() {
		return this.salarioBase+this.assalariado;
	}

}
