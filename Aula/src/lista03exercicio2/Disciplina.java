package lista03exercicio2;

import java.util.Scanner;

public class Disciplina {
	private int codigo;
	private String nome;
	private String modalidade;
	Scanner entradaTeclado = new Scanner(System.in);

	public Disciplina() {
		pegarDados();
	}

	public void pegarDados() {
		System.out.println("Codigo da disciplina:");
		codigo = entradaTeclado.nextInt();
		entradaTeclado.nextLine();
		System.out.println("Nome das disciplina:");
		nome = entradaTeclado.nextLine();
		System.out.println("Modalidade das disciplina:");
		modalidade = entradaTeclado.nextLine();

	}
	public void imprimirRelatorio() {
		System.out.println(""+codigo);
		System.out.println(""+nome);
		System.out.println(""+modalidade);
	}

	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", modalidade=" + modalidade + "]";
	}

}
