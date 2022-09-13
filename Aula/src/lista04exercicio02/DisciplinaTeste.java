package lista04exercicio02;

public class DisciplinaTeste {
	public static void main(String[]args) {
		
		Professor professor1=new Professor(722199,"Joao","09/01/1958",9500.00);
		
		Disciplina disciplina1=new Disciplina(98723411,"Quimica","Presencial",90,professor1);
		
		
		disciplina1.getProfessor().setNome("Marlon");
		
		disciplina1.emitirRelatorio();
	
		
	}
}
