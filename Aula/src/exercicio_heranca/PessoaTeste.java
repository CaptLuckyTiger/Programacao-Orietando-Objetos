package exercicio_heranca;

public class PessoaTeste {
	public static void main(String[]args) {
		Aluno aluno1=new Aluno("Jose",19,"Rua Jose","Computacao");
		
		aluno1.realizarMatricula();
		
		Professor professor1=new Professor("Maria",20,"Rua Jose",950);
		
		 professor1.calcularSalario();
		 
	}
}
