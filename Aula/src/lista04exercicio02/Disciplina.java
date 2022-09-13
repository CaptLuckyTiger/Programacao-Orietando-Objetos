package lista04exercicio02;

public class Disciplina {
	private int codigo;
	private String nome;
	private String modalidade;
	private int cargaHoraria;
	private Professor professor;
	
	public Disciplina(int codigo, String nome, String modalidade, int cargaHoraria, Professor professor) {
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHoraria = cargaHoraria;
		this.professor=professor;
	}
	
	

	public void emitirRelatorio(){
		System.out.println("Codigo da disciplina:"+this.codigo+" ");
		System.out.println("Nome da disciplina:"+this.nome+" ");
		System.out.println("Modalidade da disciplina:"+this.modalidade+" ");
		System.out.println("Carga horaria da disciplina:"+this.cargaHoraria+" ");
		System.out.println("Codigo do professor:"+this.professor.getRegistro());
		System.out.println("Nome do professor:"+this.professor.getNome());
		System.out.println("Data Nascimento do professor:"+this.professor.getDataNascimento());
		System.out.println("Salario do professor:"+this.professor.getSalario());
		
	
	}



	public Professor getProfessor() {
		return professor;
	}
	
	
}
