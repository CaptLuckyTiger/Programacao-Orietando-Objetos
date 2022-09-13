package exercicio01sobreposicao;

public class Quadrado extends Quadrilatero{
	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	

	public void calcularArea() {	
	 double resultado=lado*lado;
	 System.out.println(resultado+" ");
	}

}
