package lista03exercicio3;

public class Calculadora {
	private String marca;
	private String modelo;
	private String tipo;
	private double memoriaInterna;
	int a, b, c, d, e, f, g, h;
	int soma, sub, mult, div;

	public Calculadora(String marca, String modelo, String tipo, double memoriaInterna) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memoriaInterna = memoriaInterna;
	} 

	public void calcularSoma(int a, int b) {
		soma = a + b;
		System.out.printf("O resultado da soma é:%d", soma);
	}

	public void calcularSubtracao(int c, int d) {
		sub = c - d;
		System.out.printf("\nO resultado da subtração é:%d", sub);
	}

	public void calcularMultiplicacao(int e, int f) {
		mult = e * f;
		System.out.printf("\nO resultado da Multiplicacao é:%d", mult);
	}

	public void calcularDivisao(int g, int h) {
		div = g / h;
		System.out.printf("\nO resultado da Divisão é:%d\n", div);

	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", memoriaInterna="
				+ memoriaInterna + "]";
	}
}
