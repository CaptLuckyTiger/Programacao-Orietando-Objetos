package lista06exercicio03_1;

public class Professor extends Funcionarios {
	private Disciplina disciplina;
	private String titulacao;
	private double gratificacaoTitulacao;
	private double resultado;

	public Professor(long registro, String nome, String dataAdmissao, double salarioBase, Disciplina disciplina,
			String titulacao, double gratificacaoTitulacao) {
		super(registro, nome, dataAdmissao, salarioBase);
		this.disciplina = disciplina;
		this.titulacao = titulacao;
		this.gratificacaoTitulacao = gratificacaoTitulacao;
	}

	public void calcularSalario() {
		this.resultado = this.salarioBase + this.gratificacaoTitulacao;
		// System.out.println("Salario finla do Professor �:" + this.resultado);
	}
	
	public void emitirRelatorio() {
		super.emitirRelatorio();
	
		System.out.println("Titula��o do professor: " + this.titulacao);
		System.out.println("Salario total:" + this.resultado);
		System.out.println("Codigo da disciplina: " + this.disciplina.getCodigo());
		System.out.println("Nome da disciplina: " + this.disciplina.getDisciplinaNome());
		System.out.println("Ementa da disciplina: " + this.disciplina.getEmenta());
		System.out.println("Carga horaria da disciplina: " + this.disciplina.getCargaHoraria());
	}
}
