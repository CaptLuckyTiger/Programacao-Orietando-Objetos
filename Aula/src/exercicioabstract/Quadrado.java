package exercicioabstract;

public class Quadrado extends AreaPerimetro {
	private Double lado;
	
	public Quadrado(String cor, Double lado) {
		super(cor);
		this.lado = lado;
	}
	@Override
	public Double calcularArea() {
		
		return this.lado*this.lado;
	}
	@Override
	public Double calcularPerimetro() {
		
		return this.lado*4;
	}
	
	
}
