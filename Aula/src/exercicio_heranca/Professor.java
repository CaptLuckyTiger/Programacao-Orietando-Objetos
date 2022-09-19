package exercicio_heranca;

public class Professor extends Pessoa{
	
	private double salario;
	
	public Professor(String nome, int idade, String endereco,int salario) {
		super(nome, idade, endereco);
		
		this.salario=salario;
		
	}

	public void calcularSalario() {
		System.out.println(this.nome+ " "+ this.endereco + " "+this.salario+""+ " reais ");
	}
	
}
