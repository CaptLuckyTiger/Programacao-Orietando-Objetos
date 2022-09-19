package lista06exercicio03_1;

public class Funcionarios {
	protected long Registro;
	protected String nome;
	protected  String dataAdmissao;
	protected double salarioBase;
	
	public Funcionarios(long registro, String nome, String dataAdmissao, double salarioBase) {
		Registro = registro;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salarioBase = salarioBase;
	}
		
	public void emitirRelatorio() {
		System.out.println("Registro: "+this.Registro);
		System.out.println("Nome : "+this.nome);
		System.out.println("Data de admiss�o "+this.dataAdmissao);
	}
	
}
