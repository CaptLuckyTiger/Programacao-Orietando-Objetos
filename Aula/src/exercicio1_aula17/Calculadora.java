package exercicio1_aula17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	private Scanner input;

	public Calculadora() {
		this.input = new Scanner(System.in);
	}

	public void adicao() {
		try {
			System.out.println("X:");
			int x = this.input.nextInt();
			System.out.println("Y:");
			int y = this.input.nextInt();

			int resultado = x + y;

			System.out.println("Resultado: " + resultado);

		} catch (InputMismatchException ime) {
			System.out.println("Only numbers: ");
		}
	}

	public void multiplicacao() {
		try {
			System.out.println("X");
			int x = this.input.nextInt();
			System.out.println("Y");
			int y = this.input.nextInt();

			int resultado = x * y;

			System.out.println("Resultado: " + resultado);
		} catch (InputMismatchException ime) {
			System.out.println("Only numbers: ");
		}
	}

	public void subtracao() {

		System.out.println("X");
		int x = this.input.nextInt();
		System.out.println("Y");
		int y = this.input.nextInt();

		int resultado = x - y;

		System.out.println("Resultado: " + resultado);

	}

	public void divisao() throws ArithmeticException {
		try {
			System.out.println("X");
			int x = this.input.nextInt();
			System.out.println("Y");
			int y = this.input.nextInt();

			int resultado = x / y;

			System.out.println("Resultado: " + resultado);

		} catch (ArithmeticException ae) {

			System.out.println("Impossible divid by zero: ");
		} catch (InputMismatchException ime) {
			System.out.println("Only numbers: ");
		}
	}

	public void potenciacao() {
		try {
			System.out.println("Informe a base");
			int x = this.input.nextInt();
			System.out.println("Informe o expoente");
			int y = this.input.nextInt();

			int resultado = y + (x * x);

			System.out.println("Resultado: " + resultado);
		} catch (InputMismatchException ime) {
			System.out.println("Only numbers: ");
		}
	}

	public void raizQuadrada() {
		try {
			System.out.println("X");
			int x = this.input.nextInt();

			int resultado = x * x;

			System.out.println("Resultado: " + resultado);
		} catch (InputMismatchException ime) {
			System.out.println("Only numbers: ");
		}
	}

	public void inverso() {
		try {
			System.out.println("X");
			int x = this.input.nextInt();

			int resultado = 1 / x;

			System.out.println("Resultado: " + resultado);
		} catch (InputMismatchException ime) {
			System.out.println("Only numbers: ");
		}
	}
}
