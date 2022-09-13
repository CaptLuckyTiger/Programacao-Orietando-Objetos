package lista06exercicio03;

public class TecnicosAdminstrativos {

	private Processo processo;
	
	private long Registro;
	private String nome;
	private String dataAdmissao;
	private double salarioBase;
	private double adicionalNoturno;
	private double resultado;

	public TecnicosAdminstrativos(Processo processo, long registro, String nome, String dataAdmissao,
			double salarioBase, double adicionalNoturno) {
		this.processo = processo;
		Registro = registro;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salarioBase = salarioBase;
		this.adicionalNoturno = adicionalNoturno;
	}
	public void salarioTecnico() {
	this.resultado=this.salarioBase+this.adicionalNoturno;
	//System.out.println("O salario do funcionario Tecnico Adminstrativo é:"+this.resultado);
	
	}
	
	public void emitirRelatiorio() {
		System.out.println("Registro: "+this.Registro);
		System.out.println("Nome : "+this.nome);
		System.out.println("Data de admissão "+this.dataAdmissao);
		System.out.println("Salario total: "+this.resultado);
		System.out.println("Numero de processos controlando: "+this.processo.getNumero());
		System.out.println("Data da criacao do processo: "+this.processo.getDataCriacao());
		System.out.println("Descrição do processo: "+this.processo.getDescricao());
	
	}
}
