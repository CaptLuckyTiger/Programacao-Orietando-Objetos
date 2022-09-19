package exercicio_heranca;

public class Aluno extends Pessoa {

	private String curso;

	public Aluno(String nome, int idade, String endereco,String curso) {
		super(nome, idade, endereco);
		this.curso=curso;
	}

	public void realizarMatricula() {
		System.out.println(this.curso+""+this.nome+"");
	}
}
