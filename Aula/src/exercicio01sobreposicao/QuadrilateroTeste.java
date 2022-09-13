package exercicio01sobreposicao;

public class QuadrilateroTeste {
	public static void main(String[] args) {

		Quadrilatero quadrilatero = null;

		//quadrilatero = new Quadrado(2.5);

		//quadrilatero = new Retangulo(4.1, 5.2);
		quadrilatero = new Losango(9.7, 6.1);
		
		quadrilatero.calcularArea();
	}

}
