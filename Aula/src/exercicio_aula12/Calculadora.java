package exercicio_aula12;

public class Calculadora {
	
	private double media;
	
	
	public void calcularMedia(double a, double b) {
		this.media=(a+b)/2;
	}

	public void calcularMedia(double a, double b, double c) {
		this.media=(a+b+c)/3;
	}

	public void calcularMedia(double a, double b, double c, double d) {
		this.media=(a+b+c+d)/4;
	}
	
	public void imprimir() {
		System.out.println("Valor de media:"+this.media);
	}
}
