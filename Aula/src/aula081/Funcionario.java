package aula081;

public class Funcionario {
	private int registro;
	private String nome;
	private String dataAdmissao;
	private DiaSemana diaFolga;
	
	public Funcionario(int registro, String nome, String dataAdmissao) {
		
		this.registro = registro;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
	}
	
	public void definirDiaFolga(DiaSemana diaFolga) {
		
		this.diaFolga = diaFolga;
	}
	
	public void imprimirRelatorio() {
		
		System.out.println("Registro: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Admissão: " + this.dataAdmissao);
		System.out.println("Dia da Semana: " + this.diaFolga.getDia());
		System.out.println("Dia de Folga: " + this.diaFolga.getDiaExtenso());
	}
}
