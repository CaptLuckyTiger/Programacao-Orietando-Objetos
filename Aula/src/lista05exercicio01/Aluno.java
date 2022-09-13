package lista05exercicio01;

public class Aluno extends Pessoa {
	
	protected int numeroMatricula;
	
	public Aluno(String nome, String dataNascimento, long rg, long cpf, int numeroMatricula) {
		super(nome, dataNascimento, rg, cpf);
		this.numeroMatricula = numeroMatricula;
	}

	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Numero de matricula:"+this.numeroMatricula);
	}
	
	

	
	
}
