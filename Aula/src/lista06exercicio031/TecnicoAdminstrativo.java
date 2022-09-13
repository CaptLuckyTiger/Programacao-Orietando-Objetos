package lista06exercicio031;

public class TecnicoAdminstrativo extends Funcionarios {
	Processos processo;
	private double adicionalNoturno;
	private double resultado;

	public TecnicoAdminstrativo(Processos processo,long registro, String nome, String dataAdmissao, double salarioBase,
			double adicionalNoturno) {
		super(registro, nome, dataAdmissao, salarioBase);
		this.adicionalNoturno = adicionalNoturno;
		this.processo=processo;
	}

	public void salarioTecnico() {
		this.resultado = this.salarioBase + this.adicionalNoturno;
		// System.out.println("O salario do funcionario Tecnico Adminstrativo
		// é:"+this.resultado);

	}
	
	public void emitirRelatorio() {
		super.emitirRelatorio();
		System.out.println("Salario total: "+this.resultado);
		System.out.println("Numero de processos controlando: "+this.processo.getNumero());
		System.out.println("Data da criacao do processo: "+this.processo.getDataCriacao());
		System.out.println("Descrição do processo: "+this.processo.getDescricao());
	
	}
}
