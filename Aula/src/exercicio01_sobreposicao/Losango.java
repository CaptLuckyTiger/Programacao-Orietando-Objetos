package exercicio01_sobreposicao;

public class Losango extends Quadrilatero {
	private double diagonalMenor;
	private double diagonalMaior;
	public Losango(double diagonlaMenor, double diagonalMaior) {
		super();
		this.diagonalMenor = diagonlaMenor;
		this.diagonalMaior = diagonalMaior;
	}
	
	public void calcularArea() {	
		 double resultado=diagonalMenor*diagonalMaior;
		 System.out.println(resultado+" ");
		}
}
