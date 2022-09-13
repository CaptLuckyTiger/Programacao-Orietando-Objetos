package exercicio01sobreposicao;

public class Retangulo  extends Quadrilatero{
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public void calcularArea() {	
	 double resultado=base*altura;
	 System.out.println(resultado+" ");
	}
}
