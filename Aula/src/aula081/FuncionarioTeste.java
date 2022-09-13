package aula081;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario(123, "João da Silva", "18/04/2022");
		funcionario1.definirDiaFolga(DiaSemana.SEGUNDA);
		funcionario1.imprimirRelatorio();
	}
}
