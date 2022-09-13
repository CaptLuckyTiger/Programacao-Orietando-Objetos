package classeabstrata;

public class Comissionado extends Funcionario {
	private Double totalVendas;
	private Double taxaComissao;



	public Comissionado(String nome, long cpf, double salarioBase, Double totalVendas, Double taxaComissao) {
		super(nome, cpf, salarioBase);
		this.totalVendas = totalVendas;
		this.taxaComissao = taxaComissao;
	}


	@Override
	public Double calcularSalario() {
		return this.salarioBase+(this.totalVendas+this.taxaComissao);
	}
}
