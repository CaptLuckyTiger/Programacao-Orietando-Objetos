package classeabstrata;

public class Horista extends Funcionario {
	private Double precoHora;
	private Integer horasTrabalhadas;

	public Horista(String nome, long cpf, double salarioBase, double precoHora, Integer horasTrabalhadas) {
		super(nome, cpf, salarioBase);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Double calcularSalario() {
		return this.salarioBase+(this.precoHora+this.horasTrabalhadas);
	}

}
