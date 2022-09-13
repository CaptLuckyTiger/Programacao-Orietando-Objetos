package lista06exercicio03;

public class Professores {
	
	private Disciplina disciplina;
	
	private long Registro;
	private String nome;
	private String titulacao;
	private String dataAdmissao;
	private double salarioBase;
	private double gratificaoTitulacao;
	private double resultado;

	public Professores(Disciplina disciplina, long registro, String nome, String titulacao, String dataAdmissao,
			double salarioBase, double gratificaoTitulacao) {
		this.disciplina = disciplina;
		Registro = registro;
		this.nome = nome;
		this.titulacao = titulacao;
		this.dataAdmissao = dataAdmissao;
		this.salarioBase = salarioBase;
		this.gratificaoTitulacao = gratificaoTitulacao;
	}

	public void calcularSalario() {
		this.resultado = this.salarioBase + this.gratificaoTitulacao;
		// System.out.println("Salario finla do Professor é:" + this.resultado);
	}

	public void emitirRelatorio() {
		System.out.println("Numero Registro do Professor: " + this.Registro);
		System.out.println("Nome do Professor: " + this.nome);
		System.out.println("Titulação do professor: " + this.titulacao);
		System.out.println("Data de admissão do professor: " + this.dataAdmissao);
		System.out.println("Salario total:" + this.resultado);
		System.out.println("Codigo da disciplina: " + this.disciplina.getCodigo());
		System.out.println("Nome da disciplina: " + this.disciplina.getDisciplinaNome());
		System.out.println("Ementa da disciplina: " + this.disciplina.getEmenta());
		System.out.println("Carga horaria da disciplina: " + this.disciplina.getCargaHoraria());

	}
}
